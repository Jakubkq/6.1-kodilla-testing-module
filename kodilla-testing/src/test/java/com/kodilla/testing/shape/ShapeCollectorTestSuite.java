package com.kodilla.testing.shape;
import org.junit.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import java.util.ArrayList;
import java.util.Arrays;


@Nested
@DisplayName("Test for Shape Collestor")
public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests were finished");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("This is the " + testCounter + " test");
    }

    @DisplayName("Tests for the method A")
    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector testList = new ShapeCollector(new ArrayList<Shape>(Arrays.asList(
                new Circle(23),
                new Triangle(12, 18))));
        ShapeCollector expectedList = new ShapeCollector(new ArrayList<Shape>(Arrays.asList(
                new Circle(23),
                new Triangle(12, 18),
                new Square(12))));
        int expectedListSize = expectedList.getShapeList().size();
        //When
        testList.addFigure(new Square(12));
        int actualListSize = testList.getShapeList().size();

        //Then
        Assert.assertEquals(expectedListSize, actualListSize);
    }
    @DisplayName("Tests for the method B")
    @Test
    public void testRemoveFigure() {
        //Given
        Circle circle = new Circle(23);
        Triangle triangle = new Triangle(12, 18);
        Square square = new Square(12);

        ShapeCollector testList = new ShapeCollector(new ArrayList<Shape>(Arrays.asList(
                circle, triangle, square)));

        ShapeCollector expectedList = new ShapeCollector(new ArrayList<Shape>(Arrays.asList(
                circle, triangle)));

        int expectedListSize = expectedList.getShapeList().size();
        //When
        testList.removeFigure(square);
        int actualListSize = testList.getShapeList().size();

        //Then
        Assert.assertEquals(expectedListSize, actualListSize);

    }
    @DisplayName("Tests for the method C")
    @Test
    public void testGetFigure() {
        //Given
        Circle circle = new Circle(23);
        Triangle triangle = new Triangle(12, 18);
        Square square = new Square(12);

        ShapeCollector testList = new ShapeCollector(new ArrayList<Shape>(Arrays.asList(
                circle, triangle, square)));

        //When
        Shape shape1=testList.getFigure(1);
        Shape shape2=testList.getFigure(-1);
        Shape shape3=testList.getFigure(3);


        //Then
        Assert.assertEquals(triangle, shape1);
        Assert.assertEquals(null, shape2);
        Assert.assertEquals(null, shape3);
    }
    @DisplayName("Tests for the method D")
    @Test
    public void testShowFigures() {
        //Given
        Circle circle = new Circle(23);
        Triangle triangle = new Triangle(12, 18);
        Square square = new Square(12);
        ArrayList<Shape> testList=new ArrayList<Shape>(Arrays.asList(
                circle, triangle, square));
        ShapeCollector shapesCollection = new ShapeCollector(testList);

        //When



        //Then
        Assert.assertEquals(testList,shapesCollection.showFigures());
    }
}

