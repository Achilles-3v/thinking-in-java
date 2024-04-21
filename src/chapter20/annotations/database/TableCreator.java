package chapter20.annotations.database;

import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;

public class TableCreator {
    private static String getConstraints(Constraints con) {
        String constraints = "";
        if(!con.allowNull())
            constraints += " NOT NULL";
        if(con.primaryKey())
            constraints += " PRIMARY KEY";
        if(con.unique())
            constraints += " UNIQUE";
        return constraints;
    }
}
