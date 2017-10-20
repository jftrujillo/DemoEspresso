package com.example.jhonfredytrujilloortega.demotesting.UI.listNotes


import android.support.test.espresso.ViewInteraction
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import android.test.suitebuilder.annotation.LargeTest
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent

import com.example.jhonfredytrujilloortega.demotesting.R

import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.TypeSafeMatcher
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.action.ViewActions.closeSoftKeyboard
import android.support.test.espresso.action.ViewActions.replaceText
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed
import android.support.test.espresso.matcher.ViewMatchers.withClassName
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withText
import org.hamcrest.Matchers.allOf
import org.hamcrest.Matchers.`is`

@LargeTest
@RunWith(AndroidJUnit4::class)
class ListNotesActivityTest {

    @get:Rule
     public val mActivityTestRule = ActivityTestRule(ListNotesActivity::class.java)

    @Test
    fun listNotesActivityTest() {
        val floatingActionButton = onView(
                allOf(withId(R.id.add), isDisplayed()))
        floatingActionButton.perform(click())

        val appCompatEditText2 = onView(
                allOf(withId(R.id.description), isDisplayed()))
        appCompatEditText2.perform(replaceText("Como estas?"), closeSoftKeyboard())


        val appCompatEditText1 = onView(
                allOf(withId(R.id.titulo2), isDisplayed()))
        appCompatEditText1.perform(replaceText("Hola"), closeSoftKeyboard())


        val floatingActionButton2 = onView(
                allOf(withId(R.id.addNote), isDisplayed()))
        floatingActionButton2.perform(click())

        val textView = onView(
                allOf(withId(R.id.textView), withText("Hola"),
                        isDisplayed()))
        textView.check(matches(withText("Hola")))

    }
}
