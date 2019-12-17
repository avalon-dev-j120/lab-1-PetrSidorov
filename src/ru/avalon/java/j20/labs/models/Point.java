package ru.avalon.java.j20.labs.models;
/**
 * Модель представления о точке.
 */
public class Point<T extends Number> {
    /**
     * Основной конструктор класса.
     *
     * @param x абсцисса точки
     * @param y ордината точки
     */
//    public Point (T x, T y) 
            /**
     * Абсцисса точки.
     */
    private final T x;
    /**
     * Ордината точки.
     */
    private final T y;
    
    public Point(T x, T y){
       this.x = x;
       this.y = y;
   }
    /**
     * Возвращает абсциссу точки.
     *
     * @return x-координата точки.
     */
    public T getX() {
        return x;
    }
    /**
     * Возвращает ординату точки.
     *
     * @return y-координата точки.
     */
    public T getY() {
        return y;
    }
    /**
     * Возвращает дистанцию от точки до точки.
     *
     * @param point точка, до которой следует вычислить
     *              дистанцию.
     * @return дистанция между точками
     */
    public double distanсeTo (Point point) {
         double dx = x.doubleValue() - point.x.doubleValue();
         double dy = y.doubleValue() - point.y.doubleValue();
        return Math.sqrt(dx * dx + dy * dy);
    }


}

//    public String distanceTo(Point b) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

