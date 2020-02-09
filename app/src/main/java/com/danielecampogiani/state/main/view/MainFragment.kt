package com.danielecampogiani.state.main.view

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.observe
import com.danielecampogiani.state.Application
import com.danielecampogiani.state.R
import com.danielecampogiani.state.inject.ViewModelFactory
import com.danielecampogiani.state.main.viewmodel.MainViewModel
import com.danielecampogiani.state.utils.exhaustive
import kotlinx.android.synthetic.main.main_fragment.*
import javax.inject.Inject

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    @Inject
    lateinit var vmfactory: ViewModelFactory

    private val viewModel: MainViewModel by viewModels { vmfactory }

    override fun onAttach(context: Context) {
        Application.getAppComponent(context).inject(this)
        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.main_fragment, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val nationalityAdapter = NationalityAdapter {
            viewModel.onNationalityTap(it)
        }
        val playerAdapter = PlayerAdapter()

        nationalities.adapter = nationalityAdapter
        players.adapter = playerAdapter

        viewModel.viewState.observe(viewLifecycleOwner) {
            exhaustive..when (it) {
                ViewState.Loading -> loader.isVisible = true
                is ViewState.Data -> {
                    loader.isVisible = false
                    nationalityAdapter.submitList(it.nationalities)
                    playerAdapter.submitList(it.players)
                }
            }
        }

        viewModel.loadData()
    }
}