package com.mycompany.movie;

public class Account {
    private String username;
    private String password;
    private String email;
    private String role;
<<<<<<< HEAD
    public Account(String username, String password, String email)
    {
        this.username = username;
        this.password = password;
        this.email = email;
=======
<<<<<<< HEAD:src/com/mycompany/movie/Account.java
    public Account(String username, String password, String email)
    {
=======

    public Account(String username, String password, String email, String role) {
>>>>>>> eccd809701237b0b3c1ccddde85eb34f8ec4cc5a:src/com/mycompany/database/Account.java
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
>>>>>>> 2a66908cbf5cfbd549dc5921809e512d0ace019d
    }
    public Account(String username, String password, String email, String role) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD:src/com/mycompany/movie/Account.java
>>>>>>> 2a66908cbf5cfbd549dc5921809e512d0ace019d
    
    public String getRole()
    {
        return role;
    }
<<<<<<< HEAD
=======
=======

    public String getRole() {
        return role;
    }

    
>>>>>>> eccd809701237b0b3c1ccddde85eb34f8ec4cc5a:src/com/mycompany/database/Account.java
>>>>>>> 2a66908cbf5cfbd549dc5921809e512d0ace019d
}
