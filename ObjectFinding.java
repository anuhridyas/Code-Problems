public class ObjectFinding {
public static  Object  find()  throws Exception{
    List<Object> objectList = new ArrayList<>();
    String a = new String();
    Integer y = new Integer(8);

    objectList.add(a);
    objectList.add(y);

    ListIterator<Object> L = objectList.listIterator(objectList.size());

    while (L.hasPrevious()) {
        Object N = L.previous();
        if (N instanceof Double) {

            return N;
        }
    }

   throw new Exception();
}
    public static  void main(String[] args) {
try{
        find();
}catch (Exception e){
    System.out.print(" caught exception");
}
    }

}
