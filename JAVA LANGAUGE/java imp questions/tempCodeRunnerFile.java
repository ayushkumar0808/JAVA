
interface Circle{
    int area(int a);
}
interface Rectangle {
    int area(int a, int b);
}
class Area implements Circle,Rectangle{
    public int area(int a)
    {
        return a*a;
    }
    public int area(int a, int b){
        return a+b;
    }
}