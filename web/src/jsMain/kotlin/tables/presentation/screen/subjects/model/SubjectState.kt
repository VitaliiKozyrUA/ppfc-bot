/*
 * Copyright (c) 2023. Vitalii Kozyr
 */

package tables.presentation.screen.subjects.model

import coreui.model.TextFieldState
import tables.domain.model.Id

data class SubjectState(
    val id: Id = Id.Empty,
    val name: TextFieldState = TextFieldState.Empty
) {
    companion object {
        val Empty = SubjectState()
    }
}
