package application;

import entities.Comment;
import entities.Post;

import java.time.Instant;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = 0;
        char next;

        do {
            count++;
            Post post = addPost(sc, count);

            System.out.println("----------------------------------------------------");

            System.out.printf("Viewing the #%d post...\n", count);
            System.out.println(post);

            System.out.print("Want to keep adding posts (n/y)? ");
            next = sc.next().charAt(0);

            sc.nextLine();
        } while (next == 'y');

        sc.close();
    }

    public static Post addPost(Scanner sc, int count) {
        System.out.printf("Enter the #%d post data:\n", count);
        Instant moment = Instant.now();

        System.out.print("Title: ");
        String title = sc.nextLine();

        System.out.print("Content: ");
        String content = sc.nextLine();

        System.out.print("Likes (Quantity): ");
        int likes = sc.nextInt();

        Post post = new Post(moment, title, content, likes);

        System.out.print("Want to add comments (n/y)? ");
        char validate = sc.next().charAt(0);

        if (validate == 'y') {
            System.out.print("How many comments do you want to add? ");
            int n_comments = sc.nextInt();

            sc.nextLine();
            for (int i = 0; i < n_comments; i++) {
                System.out.printf("Enter the #%d comment data:\n", (i + 1));

                System.out.print("Enter the comment text: ");
                String comment = sc.nextLine();

                post.addComment(new Comment(comment));
            }
        }

        return post;
    }
}