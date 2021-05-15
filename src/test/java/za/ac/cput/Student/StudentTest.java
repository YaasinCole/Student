package za.ac.cput.Student;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

/*
* MUHAMMAD YAASIN COLE
*
* STUDENT NUMBER 218340869
*/
class StudentTest {



    @Test
    void ListAddTest()
    {
       List<Student> studentList = new ArrayList<>();

        for(int i =0 ; i < 10 ; i++)
        {
            String firstName = "f" + i ;
            Student S = new Student(firstName, i);

            studentList.add(S);



        }

        assertEquals(10 , studentList.size());
    }

    @Test
    void ListRemoveTest()
    {
        List<Student> studentList = new ArrayList<>();

        for(int i =0 ; i< 10 ; i++)
        {
            String firstName = "f" + i;
            Student t = new Student(firstName , i);

            studentList.add(t);

        }

        studentList.remove(0);

        assertEquals(9 , studentList.size());

    }

    @Test
    void listFindTest()
    {
        List <Student> studentList = new ArrayList<>();


        for( int i =0 ; i< 10 ; i++)
        {
            String firstName = "Name" + i ;
            Student s = new Student(firstName , i);
            studentList.add(s);

        }

        int studentNum = 100;
        String firstName = "name";
        Student p =new Student( firstName , studentNum);
        boolean contains =false ;
        studentList.add(p);


        for(Student student : studentList)
        {
            if(student.getFirstName().equals("name"))
            {
                contains = true ;

            }
            else
                {
                    contains = false;
                }

        }

        assertSame(contains , contains);

    }

    @Test
    void MapAddTest()
    {
        Map studentMap = new HashMap();

        for( int i =0 ; i<10; i++)
        {
            String firstName = "f" +i ;
            Student s = new Student (firstName , i );

            studentMap.put(i , s);

        }

        assertEquals(10 , studentMap.size());


    }

    @Test
    void MapRemoveTest()
    {
        Map studentMap = new HashMap<>();

        for(int i =0 ; i <10 ; i++)
        {
            String firstName ="f" + i ;
            Student s = new Student(firstName , i);

            studentMap.put(i , s);
        }

        studentMap.remove(0);

        assertEquals(9 , studentMap.size());
    }

    @Test
    void MapFindTest()
    {
        Map studentMap = new HashMap<>();

        for(int i = 0 ; i <10 ; i++ )
        {
            String firstName = "f" + i;

            Student s = new Student (firstName , i);
            studentMap.put(i , s);

        }
        int studentNum = 10;
        String firstName = "Map";

        Student p = new Student (firstName , studentNum);
        studentMap.put( 110 , p );

        boolean hasKey = studentMap.containsKey(110);

        assertEquals(true , hasKey);
    }


    @Test
    void SetAddTest()
    {
        Set<Student> studentSet = new HashSet<>();

        for(int i =0 ; i < 10; i++)
        {
            String firstName = "f" +i ;
            Student s = new Student(firstName , i );

            studentSet.add(s);

        }
        assertEquals(10, studentSet.size());
    }

    @Test
    void setRemoveTest()
    {
        Set<Student> studentSet = new HashSet<>();

        for(int i =0 ; i <10 ; i ++)
        {
            String firstName = "f" +i ;
            Student s = new Student(firstName , i );

            studentSet.add(s);


        }

        int studentNum = 10 ;
        String firstN = "John";
        Student p = new Student(firstN, studentNum );

        studentSet.add(p);

        studentSet.remove(p);

        assertEquals(10 , studentSet.size());
    }

    @Test
    void SetFindTest()
    {
        Set<Student> studentSet = new HashSet<>();
        int studentNum = 10 ;
        String fName ="John";

        for (int i = 0 ; i <10; i++)
        {
            String firstName = "f" + i ;
            Student s = new Student (fName , studentNum);

            studentSet.add(s);
        }

        assertEquals(1 , studentSet.size());

    }

    @Test
    void AddCollection()
    {
        Collection<Object> student = new LinkedHashSet<>();

        for (int i = 0 ;  i < 10 ; i++)
        {
            int studentNUm = 10 + i ;

            Student p = new Student ("fName" , studentNUm);
            student.add(p);
        }


        assertEquals(10 , student.size());


    }

    @Test
    void RemoveCollection()
    {
        Collection<Object> student = new LinkedHashSet<>();

        for (int i = 0 ;  i < 10 ; i++)
        {

            int studentNUm = 10 + i ;

            Student p = new Student ("fName" , studentNUm);

            student.add(p);
        }

        Student s = new Student("Paul", 10);
        student.add(s);

        student.removeAll(student);

        assertEquals(0, student.size());



    }

    @Test
    void FindCollection()
    {
        Collection<Object> student = new LinkedHashSet<>();

        for (int i = 0 ;  i < 10 ; i++)
        {

            int studentNUm = 10 + i ;

            Student p = new Student ("fName" , studentNUm);

            student.add(p);
        }

        int studentNum = 100;
        Student h = new Student("Paul" , studentNum);
        student.add(h);


        boolean isthere = false;

        if(student.contains(h))
        {
            isthere = true ;

        }

        assertSame(true , isthere);
        System.out.println(student);

    }
}