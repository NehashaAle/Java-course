public class SealedExample {
    sealed class Career permits Doctor, Teacher {

    }

    sealed class Doctor extends Career {

    }

    final class Teacher extends Career {

    }

    final class Pilot extends Doctor {

    }

    sealed interface Country permits China, Nepal {

    }

    non-sealed interface China extends Country {

    }

    non-sealed interface Nepal extends Country {

    }

    // interface Denmark extends Country { //Invalid

    // }

    public static void main(String[] args) {

    }
}
