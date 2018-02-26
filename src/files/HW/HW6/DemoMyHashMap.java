package files.HW.HW6;


import files.HW.HW6.collections.MyHashMap;

public class DemoMyHashMap {
    private MyHashMap<String,String> myHashMap= new MyHashMap<>();

    public DemoMyHashMap(){
        showDemo();
    }

    private void showDemo(){
        myHashMap.put("Yana","Paterukha");
        myHashMap.put("Yana1","Paterukha1");
        myHashMap.put("Yana2","Paterukha2");
        showInfo();

        String key = "Yana1";
        System.out.println("Get element by key \"" + key + "\":");;
        System.out.println("Element with key \"" + key + "\" has value \"" + myHashMap.get(key) + "\"");
        System.out.println();

        key = "Yana";
        System.out.println("Remove element with key \"" + key + "\" from MyHashMap:");
        myHashMap.remove(key);
        showInfo();

        System.out.println("Clear MyHashMap:");
        myHashMap.clear();
        showInfo();

    }

    private void showInfo(){
        myHashMap.print();
        System.out.println("Size is " + myHashMap.size());
        System.out.println();
    }
}
