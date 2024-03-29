/*
 * Copyright (c) 2023. Vitalii Kozyr
 */

package tables.domain.model

import com.ppfcbot.common.api.models.tables.WeekAlternation

data class ScheduleItem(
    val id: Id = Id.Empty,
    val group: Group = Group.Empty,
    val classroom: Classroom = Classroom.Empty,
    val teacher: Teacher = Teacher.Empty,
    val subject: Subject = Subject.Empty,
    val eventName: String? = null,
    val isSubject: Boolean = false,
    val lessonNumber: LessonNumber = LessonNumber.N1,
    val dayNumber: DayNumber = DayNumber.N1,
    val weekAlternation: WeekAlternation = WeekAlternation.BOTH
) {
    companion object {
        val Empty = ScheduleItem()
    }
}