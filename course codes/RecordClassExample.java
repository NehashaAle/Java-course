// class Fruits {
//     private final int id;
//     private final String name;

//     public Fruits(int id, String name) {
//         this.id = id;
//         this.name = name;
//     }

//     public int getId() {
//         return id;
//     }

//     public String getName() {
//         return name;
//     }

//     @Override
//     public String toString() {
//         return "Fruits [id=" + id + ", name=" + name + "]";
//     }

//     @Override
//     public int hashCode() {
//         final int prime = 31;
//         int result = 1;
//         result = prime * result + id;
//         result = prime * result + ((name == null) ? 0 : name.hashCode());
//         return result;
//     }

//     @Override
//     public boolean equals(Object obj) {
//         if (this == obj)
//             return true;
//         if (obj == null)
//             return false;
//         if (getClass() != obj.getClass())
//             return false;
//         Fruits other = (Fruits) obj;
//         if (id != other.id)
//             return false;
//         if (name == null) {
//             if (other.name != null)
//                 return false;
//         } else if (!name.equals(other.name))
//             return false;
//         return true;
//     }

// }

// Alternative method
//Canonical Constructor
record Fruits(int id, String name) {
    public Fruits {
        if (id == 0) {
            throw new IllegalArgumentException("Id can't be zero.");
        }
    }
}

public class RecordClassExample {
    public static void main(String[] args) {
        Fruits f1 = new Fruits(200, "Orange");
        Fruits f2 = new Fruits(200, "Orange");

        System.out.println(f1.equals(f2));
        // System.out.println(f2);
    }
}
