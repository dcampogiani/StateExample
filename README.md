# State Example

<img src="https://github.com/dcampogiani/StateExample/blob/master/demo.gif?raw=true" width="200">

A way to handle state in Android ViewModel using Flow and LiveData.


## Concepts
- [**ViewModel**](https://github.com/dcampogiani/StateExample/blob/master/app/src/main/java/com/danielecampogiani/state/main/viewmodel/MainViewModel.kt) has a private [*ViewModelState*](https://github.com/dcampogiani/StateExample/blob/master/app/src/main/java/com/danielecampogiani/state/main/viewmodel/ViewModelState.kt) and an observable [*ViewState*](https://github.com/dcampogiani/StateExample/blob/master/app/src/main/java/com/danielecampogiani/state/main/view/ViewState.kt)
- [**StateConverter**](https://github.com/dcampogiani/StateExample/blob/master/app/src/main/java/com/danielecampogiani/state/main/MainStateConverter.kt) converts *ViewModelState* into *ViewState*
- [**Reducer**](https://github.com/dcampogiani/StateExample/blob/master/app/src/main/java/com/danielecampogiani/state/main/MainReducer.kt) builds a new state based on the current one and some other input

### Implementation
[*StateViewModel*](https://github.com/dcampogiani/StateExample/blob/master/app/src/main/java/com/danielecampogiani/state/library/StateViewModel.kt) uses a [*ConflatedBroadcastChannel*](https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines.channels/-conflated-broadcast-channel/) to get access to the current state and to update it.

When there is an external interaction, the ViewModel will calculate a new *ViewModelState* [delegating the logic to a *Reducer*](https://github.com/dcampogiani/StateExample/blob/master/app/src/main/java/com/danielecampogiani/state/main/viewmodel/MainViewModel.kt#L31)
and update his private state using [```setState```](https://github.com/dcampogiani/StateExample/blob/master/app/src/main/java/com/danielecampogiani/state/library/StateViewModel.kt#L37) function.

This update will also [trigger a new *ViewState*](https://github.com/dcampogiani/StateExample/blob/master/app/src/main/java/com/danielecampogiani/state/library/StateViewModel.kt#L26) and it will be offered to the View with a LiveData.

<img src="https://github.com/dcampogiani/StateExample/blob/master/diagram.png?raw=true" width="500">

