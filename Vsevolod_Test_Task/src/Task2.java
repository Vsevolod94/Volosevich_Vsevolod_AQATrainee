public class Task2 {
    private String name;
    public String nameInd(String name){
       if(name == "Вячеслав"){
           System.out.println("Привет, Вячеслав");
       } else {
           System.out.println("Нет такого имени");
       }
       this.name = name;
       return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
