package linkedlist;

import java.util.ArrayList;
import java.util.List;

// User class
class User {
    int userId;
    String name;
    int age;
    List<Integer> friendIds; // List of friend IDs

    User(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendIds = new ArrayList<>();
    }
}

// Node class for singly linked list
class Node {
    User data;
    Node next;

    Node(User data) {
        this.data = data;
        this.next = null;
    }
}

// Social Media System
public class SocialMediaFriendConnections {
    private Node head;

    // Add user
    public void addUser(User user) {
        Node newNode = new Node(user);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newNode;
        }
    }

    // Find user by ID
    private Node findUserNodeById(int userId) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.userId == userId) return temp;
            temp = temp.next;
        }
        return null;
    }

    // Find user by Name
    private Node findUserNodeByName(String name) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.name.equalsIgnoreCase(name)) return temp;
            temp = temp.next;
        }
        return null;
    }

    // Add a friend connection (bidirectional)
    public void addFriend(int userId1, int userId2) {
        if (userId1 == userId2) {
            System.out.println("Cannot add yourself as a friend.");
            return;
        }

        Node user1 = findUserNodeById(userId1);
        Node user2 = findUserNodeById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        if (!user1.data.friendIds.contains(userId2)) user1.data.friendIds.add(userId2);
        if (!user2.data.friendIds.contains(userId1)) user2.data.friendIds.add(userId1);

        System.out.println("Friend connection added between " + user1.data.name + " and " + user2.data.name);
    }

    // Remove a friend connection
    public void removeFriend(int userId1, int userId2) {
        Node user1 = findUserNodeById(userId1);
        Node user2 = findUserNodeById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        user1.data.friendIds.remove(Integer.valueOf(userId2));
        user2.data.friendIds.remove(Integer.valueOf(userId1));

        System.out.println("Friend connection removed between " + user1.data.name + " and " + user2.data.name);
    }

    // Display all friends of a user
    public void displayFriends(int userId) {
        Node user = findUserNodeById(userId);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        System.out.println("Friends of " + user.data.name + ":");
        for (int fid : user.data.friendIds) {
            Node fNode = findUserNodeById(fid);
            if (fNode != null) {
                System.out.println("ID: " + fNode.data.userId + ", Name: " + fNode.data.name);
            }
        }
    }

    // Find mutual friends between two users
    public void mutualFriends(int userId1, int userId2) {
        Node user1 = findUserNodeById(userId1);
        Node user2 = findUserNodeById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        List<Integer> mutual = new ArrayList<>();
        for (int fid : user1.data.friendIds) {
            if (user2.data.friendIds.contains(fid)) mutual.add(fid);
        }

        System.out.println("Mutual friends between " + user1.data.name + " and " + user2.data.name + ":");
        if (mutual.isEmpty()) {
            System.out.println("None");
        } else {
            for (int fid : mutual) {
                Node fNode = findUserNodeById(fid);
                System.out.println("ID: " + fNode.data.userId + ", Name: " + fNode.data.name);
            }
        }
    }

    // Count number of friends for each user
    public void countFriends() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data.name + " has " + temp.data.friendIds.size() + " friends.");
            temp = temp.next;
        }
    }

    // Search for a user by ID or Name
    public void searchUser(int userId, String name) {
        Node result = null;
        if (userId != -1) result = findUserNodeById(userId);
        else if (name != null) result = findUserNodeByName(name);

        if (result != null) {
            System.out.println("User found -> ID: " + result.data.userId + ", Name: " + result.data.name + ", Age: " + result.data.age);
        } else {
            System.out.println("User not found.");
        }
    }

    // Main method
    public static void main(String[] args) {
        SocialMediaFriendConnections sm = new SocialMediaFriendConnections();

        // Adding users
        sm.addUser(new User(1, "Alice", 20));
        sm.addUser(new User(2, "Bob", 22));
        sm.addUser(new User(3, "Charlie", 25));
        sm.addUser(new User(4, "David", 21));
        sm.addUser(new User(5, "Eva", 23));

        // Add friend connections
        sm.addFriend(1, 2);
        sm.addFriend(1, 3);
        sm.addFriend(2, 3);
        sm.addFriend(3, 4);
        sm.addFriend(4, 5);

        // Display friends
        sm.displayFriends(3);

        // Mutual friends
        sm.mutualFriends(1, 3);

        // Remove friend
        sm.removeFriend(1, 3);
        sm.displayFriends(1);

        // Count friends
        sm.countFriends();

        // Search users
        sm.searchUser(2, null);
        sm.searchUser(-1, "Eva");
    }
}
