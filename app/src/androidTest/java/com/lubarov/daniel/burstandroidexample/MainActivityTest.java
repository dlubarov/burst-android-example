package com.lubarov.daniel.burstandroidexample;

import com.squareup.burst.BurstJUnit4;
import com.squareup.burst.annotation.Burst;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(BurstJUnit4.class)
public class MainActivityTest {
    @Rule public final TestRule activityRule = new ActivityRule<>(MainActivity.class);

    @Burst Word word;

    @Test public void testWordsAppear() {
        onView(withText(word.name())).check(matches(isDisplayed()));
    }
}