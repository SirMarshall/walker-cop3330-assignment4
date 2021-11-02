/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Carter I. Walker
 */

package ucf.assignments;
import java.io.File;

public class masterList
{
    //Title string
    //Items array (holds at least 100)

    //Method to add a new todo list
    static masterList addList(String Title)
    {
        //Query title through GUI
        masterList newList = new masterList();
        return newList;
    }

    //Method to remove a todo list
    void removeList(masterList list)
    {
        //Set list to null
    }

    //Method to edit title of todo list
    void editTitle(String newTitle, masterList list)
    {
        //Change title to passed in string
    }

    //Method to add a new item to existing todo list
    void addNewItem(masterList list)
    {
        //Call create new item function
        //Add to list in first empty index
    }

    //Method to remove an item from an existing todo list
    void removeItem(masterList list, item removed)
    {
        //Find item in list
        //Set to null
    }

    //Method to edit the desc of an item within an existing todo list
    void editDesc(masterList list, item editItem)
    {
        //Find item in lists array
        //Call edit desc method
    }

    //Method to edit due date of an item within an existing todo list
    void editDate(masterList list, item editItem)
    {
        //Find item in list array
        //Call edit date method
    }

    //Method to mark an item as complete
    void setAsDone(masterList list, item doneItem)
    {
        //Find item in array
        //Set bool to complete
    }

    //Method to display all items in todo list
    void displayItems(masterList list)
    {
        //Set scene to list view
    }

    //Method to display incomplete items in todo list
    void displayIncomplete(masterList list)
    {
        //List view scene
        //Logic gate to only view bools set to false
    }

    //Method to display complete items in todo list
    void displayComplete(masterList list)
    {
        //List view scene
        //Logic gate to only view bools set to true
    }

    //Method to save all items in list to external storage
    void saveList(masterList list)
    {
        //For each item in list
        //Export to CSV File
    }

    //Method to save all items across all lists to external storage
    void saveAll()
    {
        //For each list
        //Write all items to CSV
        //Include seperation list by list for proper reloading
    }

    //Method to load saved todo list
    masterList loadList(File input)
    {
        //Read CSV
        //Translate to list
        masterList loadedList = new masterList();
        return loadedList;
    }

    //Method to load all saved todo lists
    masterList[] loadAll(File input)
    {
        //Read CSV
        //Add to array
        //Return
        masterList[] loadedLists = new masterList[0];
        return loadedLists;
    }
}

class item
{
    //Name String
    //Description string
    //Due Date YYYY-MM-DD
    //Completion boolean

    //Method to create new item
    void newItem(String description, int dueDate)
    {
        //Instantiate new item with passed desc and due date
        //Set bool to false
    }

    //Method to edit description
    void editDesc(item editedItem, String newDesc)
    {
        //Set item desc to passed string
    }

    //Method to edit due date
    void editDue(item editedItem, int newDate)
    {
        //Set date to passed int
    }

    //Method to mark as complete
    void markDone(item completedItem)
    {
        //Set bool to true
    }
}
