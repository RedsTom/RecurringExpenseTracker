package viewmodel.database

import model.database.RecurrenceDatabase
import model.database.RecurringExpense
import kotlin.test.Test
import kotlin.test.assertEquals

class RecurringExpenseTest {
    @Test
    fun checkGetMonthlyPrice_usingDailyRecurrence_onceADay() {
        val expense =
            RecurringExpense(
                1,
                null,
                null,
                5f,
                1,
                RecurrenceDatabase.Daily.value,
                null,
                null,
            )

        assertEquals(152.08333f, expense.getMonthlyPrice())
    }

    @Test
    fun checkGetMonthlyPrice_usingDailyRecurrence_everyFewDays() {
        val expense =
            RecurringExpense(
                1,
                null,
                null,
                7f,
                8,
                RecurrenceDatabase.Daily.value,
                null,
                null,
            )

        assertEquals(26.614582f, expense.getMonthlyPrice())
    }

    @Test
    fun checkGetMonthlyPrice_usingWeeklyRecurrence_onceAWeek() {
        val expense =
            RecurringExpense(
                1,
                null,
                null,
                10f,
                1,
                RecurrenceDatabase.Weekly.value,
                null,
                null,
            )

        assertEquals(43.333336f, expense.getMonthlyPrice())
    }

    @Test
    fun checkGetMonthlyPrice_usingWeeklyRecurrence_everyFewWeeks() {
        val expense =
            RecurringExpense(
                1,
                null,
                null,
                10f,
                5,
                RecurrenceDatabase.Weekly.value,
                null,
                null,
            )

        assertEquals(8.666667f, expense.getMonthlyPrice())
    }

    @Test
    fun checkGetMonthlyPrice_usingMonthlyRecurrence_onceAMonth() {
        val expense =
            RecurringExpense(
                1,
                null,
                null,
                10f,
                1,
                RecurrenceDatabase.Monthly.value,
                null,
                null,
            )

        assertEquals(10f, expense.getMonthlyPrice())
    }

    @Test
    fun checkGetMonthlyPrice_usingMonthlyRecurrence_everyFewMonths() {
        val expense =
            RecurringExpense(
                1,
                null,
                null,
                10f,
                5,
                RecurrenceDatabase.Monthly.value,
                null,
                null,
            )

        assertEquals(2.0f, expense.getMonthlyPrice())
    }

    @Test
    fun checkGetMonthlyPrice_usingYearlyRecurrence_onceAYear() {
        val expense =
            RecurringExpense(
                1,
                null,
                null,
                10f,
                1,
                RecurrenceDatabase.Yearly.value,
                null,
                null,
            )

        assertEquals(0.8333333f, expense.getMonthlyPrice())
    }

    @Test
    fun checkGetMonthlyPrice_usingYearlyRecurrence_everyFewYears() {
        val expense =
            RecurringExpense(
                1,
                null,
                null,
                10f,
                5,
                RecurrenceDatabase.Yearly.value,
                null,
                null,
            )

        assertEquals(0.16666667f, expense.getMonthlyPrice())
    }
}
