import java.util.Arrays;

/**
 * Created by timol on 10.12.2015.
 */



public class main {
    public static void main(String[] args) throws Exception {

        CreationInfo creationInfo = AnnotationTest.class.getAnnotation(CreationInfo.class);
        if (creationInfo != null) printCreationInfo(creationInfo);
        else System.out.println("Keine " + CreationInfo.class.getSimpleName() + "-Annotation vorhanden.");

        creationInfo = fooclass.class.getAnnotation(CreationInfo.class);
        if (creationInfo != null) printCreationInfo(creationInfo);
        else System.out.println("Keine " + CreationInfo.class.getSimpleName() + "-Annotation vorhanden.");

    }

    private static void printCreationInfo(CreationInfo creationInfo) {
        System.out.println("author: " + creationInfo.author());
        System.out.println("description: " + creationInfo.description());
        System.out.println("tags: " + Arrays.toString(creationInfo.tags()));
        System.out.println("baseclass: " + creationInfo.baseclass().toString());
        System.out.println("interfaces: " + Arrays.toString(creationInfo.interfaces()));

    }
}


