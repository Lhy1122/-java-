/*
 * @Author: your name
 * @Date: 2022-04-24 23:37:09
 * @LastEditTime: 2022-04-24 23:37:25
 * @LastEditors: your name
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \undefinedd:\java\java-algorithm\14-Hash-Table\03-Hash-Function-in-Java\Strdent.java
 */
public class Student {

    int grade;
    int cls;
    String firstName;
    String lastName;

    Student(int grade, int cls, String firstName, String lastName){
        this.grade = grade;
        this.cls = cls;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public int hashCode(){

        int B = 31;
        int hash = 0;
        hash = hash * B + ((Integer)grade).hashCode();
        hash = hash * B + ((Integer)cls).hashCode();
        hash = hash * B + firstName.toLowerCase().hashCode();
        hash = hash * B + lastName.toLowerCase().hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object o){

        if(this == o)
            return true;

        if(o == null)
            return false;

        if(getClass() != o.getClass())
            return false;

        Student another = (Student)o;
        return this.grade == another.grade &&
                this.cls == another.cls &&
                this.firstName.toLowerCase().equals(another.firstName.toLowerCase()) &&
                this.lastName.toLowerCase().equals(another.lastName.toLowerCase());
    }
}