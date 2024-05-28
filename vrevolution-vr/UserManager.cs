using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public static class UserManager
{
    private static string userEmail;

    public static string UserEmail
    {
        get { return userEmail; }
        set { userEmail = value; }
    }

}
