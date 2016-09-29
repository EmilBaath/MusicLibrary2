package com.academy;


import java.util.List;

public interface Repository {
    List<Link> getLinks(long listID);
    List<LinkList> getLists(long userID);
    User getUser(String username);
    boolean isPasswordValid(String username, String password);
    void createNewList(long userID, String listName, String description);
}
