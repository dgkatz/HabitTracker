package com.strattondesign.habittracker;

import android.provider.BaseColumns;

class HabitsContract {
    /**
     * Habit Entry
     * The inner class that defines the contents of the habits table
     */
    public static final class HabitsEntry implements BaseColumns {
        // The internal id is used by all tables
        public static final String HABITS_TABLE_NAME = "habits";
        //The habits table fields
        public static final String habitId = "rowid";
        public static final String habitName = "name";
        public static final String habitCount = "count";
        public static final String habitDateAdded = "date_added";
        public static final String habitDateLastDone = "date_last_done";
    }
}
