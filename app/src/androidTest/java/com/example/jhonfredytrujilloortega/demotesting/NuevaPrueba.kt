package com.example.jhonfredytrujilloortega.demotesting

import android.support.test.espresso.Espresso
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.*
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed
import android.support.test.filters.LargeTest
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.example.jhonfredytrujilloortega.demotesting.UI.addNote.AddNoteActivity
import org.hamcrest.Matchers.allOf
import android.support.test.espresso.matcher.ViewMatchers.withId
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import android.support.test.InstrumentationRegistry.getTargetContext
import android.content.ComponentName
import android.support.test.espresso.intent.Intents.intended
import android.support.test.espresso.intent.matcher.IntentMatchers.hasComponent
import com.example.jhonfredytrujilloortega.demotesting.UI.listNotes.ListNotesActivity
import android.app.Activity
import android.support.test.runner.lifecycle.Stage
import android.support.test.runner.lifecycle.ActivityLifecycleMonitorRegistry
import android.support.test.InstrumentationRegistry.getInstrumentation
import android.support.test.espresso.assertion.ViewAssertions.*


/**
 * Created by jhonfredytrujilloortega on 10/20/17.
 */
@RunWith(AndroidJUnit4::class)
@LargeTest
class NuevaPrueba {
    @get:Rule
    public val nuevaPruebaTestRule = ActivityTestRule(AddNoteActivity::class.java)
    @Test
    fun validateStrings() {
        val titulo = onView(
                allOf(withId(R.id.titulo2), isDisplayed()))
        titulo.perform(replaceText(""), closeSoftKeyboard())

        val floatingActionButton2 = onView(
                allOf(withId(R.id.addNote), isDisplayed()))
        floatingActionButton2.perform(click())
        onView(withId(R.id.description)).check(matches(isDisplayed()))
    }
}