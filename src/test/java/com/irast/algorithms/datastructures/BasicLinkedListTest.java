package com.irast.algorithms.datastructures;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BasicLinkedListTest {

    private BasicLinkedList app;

    @Before
    public void setUp() {
        app = new BasicLinkedList();
    }

    @Test
    public void shouldGetTheSize() {

        int nodeCount = app.size();
        assertEquals(0, nodeCount);
    }

    @Test
    public void shouldAddItem() {

        addItemToList(10);
        assertEquals(1, app.size());
        assertTrue(app.first != null);
        assertTrue(app.last != null);
        assertEquals(app.first, app.last);
    }

    @Test
    public void shouldAddItemToTheLastNodeWhenTheListIsNotEmpty() {

        addItemToList(10, 11);

        assertEquals(2, app.size());
        assertEquals(10, app.first.getValue());
        assertEquals(11, app.last.getValue());
        assertNotEquals(app.first.getValue(), app.last.getValue());
    }

    @Test
    public void shouldRemoveItemFromTheList() {

        addItemToList(10, 11);
        app.remove();

        assertEquals(1, app.size());
        assertEquals("Wrong value of first node", 11, app.first.getValue());
        assertEquals("Wrong value of last node", 11, app.last.getValue());
    }

    @Test(expected = IllegalStateException.class)
    public void shouldNotBeAbleToRemoveFromAnEmptyList() {

        app.remove();
    }

    @Test
    public void shouldAddItemAtAPosition() {

        app.insert(1, 0);
        app.insert(2, 1);

        assertEquals(1, app.first.getValue());
        assertEquals(2, app.last.getValue());
        assertEquals(2, app.size());
    }

    @Test(expected = IllegalStateException.class)
    public void shouldNotBeAbleToAddItemAtPostionGreaterThanListSize() {

        app.insert(10, 1);
    }

    @Test
    public void shouldModifyFirstNodeWhenInsertingAtIndexZero() {

        addItemToList(10, 11);
        app.insert(20, 0);

        assertEquals(3, app.size());
        assertEquals(20, app.first.getValue());
    }

    @Test
    public void shouldModifyLastNodeWhenInsertingAtIndexEqualsToNodeCount() {

        addItemToList(10, 11);
        app.insert(20, 2);

        assertEquals(3, app.size());
        assertEquals(20, app.last.getValue());
    }

    @Test(expected = IllegalStateException.class)
    public void shouldNotBeAbleToRemoveAtPositionGreaterThanNodeSize() {

        app.removeAt(1);
    }

    @Test
    public void shouldModifyTheFirstElementWhenRemovingTheFirstElement() {

        addItemToList(10, 11);

        int val = (Integer) app.removeAt(0);

        assertEquals(1, app.size());
        assertEquals(11, app.first.getValue());
        assertEquals(10, val);
    }

    @Test
    public void shouldModifyTheLastElementWhenRemovingTheLastElement() {

        addItemToList(10, 11);


        int val = (Integer) app.removeAt(1);

        assertEquals(1, app.size());
        assertEquals(10, app.first.getValue());
        assertEquals(10, app.last.getValue());
        assertEquals(11, val);
    }

    @Test
    public void shouldRemoveANode() {

        addItemToList(10, 11, 12);

        int val = (Integer) app.removeAt(1);

        assertEquals(2, app.size());
        assertEquals(10, app.first.getValue());
        assertEquals(12, app.last.getValue());
        assertEquals(11, val);
    }

    @Test
    public void shouldGetItemAtPosition() {

        addItemToList(10, 11, 12, 13);

        int val = (Integer) app.get(1);

        assertEquals(11, val);
    }

    @Test
    public void shouldFindItem() {

        addItemToList(10, 11, 12);

        int val = app.find(11);
        assertEquals(1, val);

    }
    private void addItemToList(int... items) {
        for (int item : items) {
            app.add(item);
        }
    }
}