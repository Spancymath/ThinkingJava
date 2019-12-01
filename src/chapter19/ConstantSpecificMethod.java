package chapter19;

import utils.P;

import java.lang.reflect.Constructor;
import java.text.DateFormat;
import java.util.Date;

public enum ConstantSpecificMethod {
    DATE_TIME {
        String getInfo() {
            return DateFormat.getDateInstance().format(new Date());
        }
    },

    CLASSPATH {
        String getInfo() {
            return System.getenv("CLASSPATH");
        }
    },

    VERSION {
        String getInfo() {
            return System.getProperty("java.version");
        }
    };

    abstract String getInfo();

    public static void main(String[] args) {
        for (ConstantSpecificMethod csm : values()) {
            P.println(csm.getInfo());
        }
    }
}
