// Java Program to print the Alphabets
// of a Given Word using * pattern

import java.util.Scanner;

public class AnyWordPatternprint{

static char ch;

// Function to print the letter A
static void a()
{
	System.out.printf("\n");
	for (int i = 0; i < 8; i++) {
		System.out.printf(" ");
		for (int j= 0; j< 8; j++) {
			if (i == 0 && (j== 0 || j== 7))
				System.out.printf(" ");
			else if (j< 2 || j> 5) {
				System.out.printf("%c", ch);
			}
			else if (i < 2 || (i > 3 && i < 5)) {
				System.out.printf("%c", ch);
			}

			else
				System.out.printf(" ");
		}
		System.out.printf("\n");
	}
}

// Function to print the letter B
static void b()
{
	System.out.printf("\n");
	for (int i = 0; i < 9; i++) {
		System.out.printf(" %c%c", ch, ch);

		for (int j = 0; j < 6; j++) {
			if (i == 0 && j < 5)
				System.out.printf("%c", ch);
			else if (i == 1)
				System.out.printf("%c", ch);
			else if (i < 4 && i > 0
					&& j> 3) {
				System.out.printf("%c", ch);
			}

			else if (i == 4 && j< 5) {
				System.out.printf("%c", ch);
			}
			else if (i > 4 && i < 7
					&& j> 3) {
				System.out.printf("%c", ch);
			}
			else if (i == 7) {
				System.out.printf("%c", ch);
			}
			else if (i == 8 && j< 5) {
				System.out.printf("%c", ch);
			}

			else
				System.out.printf(" ");
		}
		System.out.printf("\n");
	}
}

// Function to print the letter C
static void c()
{
	System.out.printf("\n");
	for (int i = 0; i < 8; i++) {

		System.out.printf(" ");
		for (int j = 0; j < 8; j++) {
			if (i == 0 && (j <= 1))
				System.out.printf(" ");
			else if (i == 1
					&& (j == 0 || j == 8 - i
						|| (j > 1)))
				System.out.printf(" ");
			else if (i == 2
					&& (j == 1 || j == 8 - i
						|| (j > 1)))
				System.out.printf(" ");
			else if ((i == 3 || i == 4
					|| i == 5)
					&& (j > 0))
				System.out.printf(" ");
			else if (i == 6
					&& (j == 0 || j == 8 + 5 - i
						|| (j > 1)))
				System.out.printf(" ");
			else if (i == 7
					&& (j <= 1))
				System.out.printf(" ");
			else {
				System.out.printf("%c", ch);
			}
		}
		System.out.printf("\n");
	}
}

// Function to print the letter D
static void d()
{
	System.out.printf("\n");
	for (int i = 0; i < 8; i++) {
		{
			System.out.printf(" %c", ch);
		}

		for (int j = 0; j < 8; j++) {
			if (i == 0 && (j >= 6 - i))
				System.out.printf(" ");
			else if (i == 1
					&& (j == 0 || j == 8 - i
						|| (j < 6)))
				System.out.printf(" ");
			else if (i == 2
					&& (j == 1 || j == 8 - i
						|| (j < 6)))
				System.out.printf(" ");
			else if ((i == 3 || i == 4
					|| i == 5)
					&& (j < 7))
				System.out.printf(" ");
			else if (i == 6
					&& (j == 0 || j == 8 + 5 - i
						|| (j < 6)))
				System.out.printf(" ");
			else if (i == 7
					&& (j >= 6 - i + 7))
				System.out.printf(" ");
			else {
				System.out.printf("%c", ch);
			}
		}
		System.out.printf("\n");
	}
}

// Function to print the letter E
static void e()
{
	System.out.printf("\n");
	for (int i = 0; i < 8; i++) {
		System.out.printf(" ");
		for (int j = 0; j < 7; j++) {
			if (i == 0) {
				System.out.printf("%c", ch);
			}
			else if (i > 0 && i < 3
					&& j < 2) {
				System.out.printf("%c", ch);
			}
			else if (i == 3 && j < 6) {
				System.out.printf("%c", ch);
			}
			else if (i > 3 && i < 6
					&& j < 2) {
				System.out.printf("%c", ch);
			}
			else if (i == 6) {
				System.out.printf("%c", ch);
			}

			else
				System.out.printf(" ");
		}
		System.out.printf("\n");
	}
}

// Function to print the letter F
static void f()
{
	System.out.printf("\n");
	for (int i = 0; i < 8; i++) {
		System.out.printf(" ");
		for (int j = 0; j < 7; j++) {
			if (i == 0) {
				System.out.printf("%c", ch);
			}
			else if (i > 0 && i < 3
					&& j < 2) {
				System.out.printf("%c", ch);
			}
			else if (i == 3 && j < 6) {
				System.out.printf("%c", ch);
			}
			else if (i > 3 && i < 7
					&& j < 2) {
				System.out.printf("%c", ch);
			}

			else
				System.out.printf(" ");
		}
		System.out.printf("\n");
	}
}

// Function to print the letter G
static void g()
{
	System.out.printf("\n");
	for (int i = 0; i < 8; i++) {

		System.out.printf(" ");
		for (int j = 0; j < 8; j++) {
			if (i == 4 && j > 3
				|| (j == 4 || j == 7)
					&& i > 4) {
				System.out.printf("%c", ch);
			}

			else if (i == 0 && (j <= 1))
				System.out.printf(" ");
			else if (i == 1
					&& (j == 0 || j == 8 - i
						|| (j > 1)))
				System.out.printf(" ");
			else if (i == 2
					&& (j == 1 || j == 8 - i
						|| (j > 1)))
				System.out.printf(" ");
			else if ((i == 3 || i == 4
					|| i == 5)
					&& (j > 0))
				System.out.printf(" ");
			else if (i == 6
					&& (j== 0 || (j> 1)))
				System.out.printf(" ");
			else if (i == 7
					&& (j<= 1 || j== 5
						|| j== 6))
				System.out.printf(" ");
			else {
				System.out.printf("%c", ch);
			}
		}
		System.out.printf("\n");
	}
}

// Function to print the letter H
static void h()
{
	System.out.printf("\n");
	for (int i = 0; i < 8; i++) {
		System.out.printf(" ");
		for (int j = 0; j < 8; j++) {
			if (j < 2 || j > 5) {
				System.out.printf("%c", ch);
			}
			else if (i > 2 && i < 5) {
				System.out.printf("%c", ch);
			}

			else
				System.out.printf(" ");
		}
		System.out.printf("\n");
	}
}

// Function to print the letter I
static void i()
{
	System.out.printf("\n");
	for (int i = 0; i < 8; i++) {

		System.out.printf(" ");

		for (int j = 0; j < 8; j++) {

			if ((i < 1 || i > 6)
				&& j < 8) {
				System.out.printf("%c", ch);
			}

			else if (i > 0 && j < 3)
				System.out.printf(" ");
			else if (i > 0 && j > 2
					&& j < 5) {
				System.out.printf("%c", ch);
			}
			else if (i > 0 && j > 4)
				System.out.printf(" ");
			else {
			}
		}
		System.out.printf("\n");
	}
}

// Function to print the letter J
static void j()
{
	System.out.printf("\n");
	for (int i = 0; i < 8; i++) {
		System.out.printf(" ");

		for (int j = 0; j < 8; j++) {
			if (i < 1) {
				System.out.printf("%c", ch);
			}
			else if (i == 5 && j < 1) {
				System.out.printf("%c", ch);
			}
			else if (i < 7 && j > 5) {
				System.out.printf("%c", ch);
			}
			else if (i == 7
					&& (j == 0 || j == 7))
				System.out.printf(" ");
			else if (i > 5) {
				System.out.printf("%c", ch);
			}
			else
				System.out.printf(" ");
		}
		System.out.printf("\n");
	}
}

// Function to print the letter K
static void k()
{
	System.out.printf("\n");
	for (int i = 0; i < 8; i++) {
		System.out.printf(" ");

		for (int j = 0; j < 7; j++) {
			if (j < 2) {
				System.out.printf("%c", ch);
			}
			else if ((j >= 5 - i)
					&& (j <= 6 - i)) {
				System.out.printf("%c", ch);
			}

			else if (i >= 4) {
				if (j == i - 2 || j == i - 1) {
					System.out.printf("%c", ch);
				}
				else
					System.out.printf(" ");
			}
			else
				System.out.printf(" ");
		}
		System.out.printf("\n");
	}
}

// Function to print the letter L
static void l()
{
	System.out.printf("\n");
	for (int i = 0; i < 8; i++) {
		System.out.printf(" ");

		{
			System.out.printf("%c%c", ch, ch);
		}
		if (i == 6) {
			{
				System.out.printf("%c%c", ch, ch);
			}
			{
				System.out.printf("%c%c", ch, ch);
			}
			System.out.printf("%c%c", ch, ch);
		}
		if (i == 7) {
			{
				System.out.printf("%c%c", ch, ch);
			}
			{
				System.out.printf("%c%c", ch, ch);
			}
			System.out.printf("%c%c", ch, ch);
		}
		System.out.printf("\n");
	}
}

// Function to print the letter M
static void m()
{
	System.out.printf("\n");

	for (int i = 0; i < 8; i++) {
		System.out.printf(" ");
		for (int j = 0; j < 8; j++) {
			if (j == 0 || j == 7) {
				System.out.printf("%c", ch);
			}
			else if (i < 4
					&& (j == 7 - i || j == i)) {
				System.out.printf("%c", ch);
			}
			else
				System.out.printf(" ");
		}
		System.out.printf("\n");
	}
}

// Function to print the letter N
static void n()
{
	System.out.printf("\n");

	for (int i = 0; i < 8; i++) {
		System.out.printf(" ");
		for (int j = 0; j < 8; j++) {
			if (j < 2 || j > 5) {
				System.out.printf("%c", ch);
			}
			else if (i == j - 1
					|| i == j + 1 || i == j) {
				System.out.printf("%c", ch);
			}
			else
				System.out.printf(" ");
		}
		System.out.printf("\n");
	}
}

// Function to print the letter O
static void o()
{
	System.out.printf("\n");
	for (int i = 0; i < 8; i++) {
		System.out.printf(" ");
		for (int j = 0; j < 8; j++) {
			if (i == 0 && (j <= 1 || j >= 6 - i))
				System.out.printf(" ");
			else if (i == 1
					&& (j == 0 || j == 8 - i
						|| (j < 6 && j > 1)))
				System.out.printf(" ");
			else if (i == 2
					&& (j == 1 || j == 8 - i
						|| (j < 6 && j > 1)))
				System.out.printf(" ");
			else if ((i == 3 || i == 4 || i == 5)
					&& (j > 0 && j < 7))
				System.out.printf(" ");
			else if (i == 6
					&& (j == 0 || j == 8 + 5 - i
						|| (j < 6 && j > 1)))
				System.out.printf(" ");
			else if (i == 7
					&& (j <= 1 || j >= 6 - i + 7))
				System.out.printf(" ");
			else {
				System.out.printf("%c", ch);
			}
		}
		System.out.printf("\n");
	}
}

// Function to print the letter P
static void p()
{
	System.out.printf("\n");
	for (int i = 0; i < 8; i++) {
		System.out.printf(" ");
		{
			System.out.printf("%c%c", ch, ch);
		}

		for (int j = 0; j < 6; j++) {
			if (i == 0 && j < 5)
				System.out.printf("%c", ch);
			else if (i == 1)
				System.out.printf("%c", ch);
			else if (i < 4 && i > 0 && j > 3) {
				System.out.printf("%c", ch);
			}

			else if (i == 4 && j < 5) {
				System.out.printf("%c", ch);
			}
			else
				System.out.printf(" ");
		}
		System.out.printf("\n");
	}
}

// Function to print the letter Q
static void q()
{
	System.out.printf("\n");
	for (int i = 0; i < 8; i++) {
		System.out.printf(" ");
		for (int j = 0; j < 8; j++) {
			if (j == i)
				System.out.printf("%c", ch);

			else if (i == 0
					&& (j <= 1 || j >= 6 - i))
				System.out.printf(" ");
			else if (i == 1
					&& (j == 0 || j == 8 - i
						|| (j < 6 && j > 1)))
				System.out.printf(" ");
			else if (i == 2
					&& (j == 1 || j == 8 - i
						|| (j < 6 && j > 1)))
				System.out.printf(" ");
			else if ((i == 3 || i == 4 || i == 5)
					&& (j > 0 && j < 7))
				System.out.printf(" ");
			else if (i == 6
					&& (j == 0 || j == 8 + 5 - i
						|| (j < 6 && j > 1)))
				System.out.printf(" ");
			else if (i == 7
					&& (j <= 1 || j >= 6 - i + 7))
				System.out.printf(" ");
			else {
				System.out.printf("%c", ch);
			}
		}
		System.out.printf("\n");
	}
}

// Function to print the letter R
static void r()
{
	System.out.printf("\n");
	for (int i = 0; i < 8; i++) {
		System.out.printf(" ");
		{
			System.out.printf("%c%c", ch, ch);
		}

		for (int j = 0; j < 6; j++) {
			if (i == 0 && j < 5)
				System.out.printf("%c", ch);
			else if (i == 1)
				System.out.printf("%c", ch);
			else if (i < 4 && i > 0
					&& j > 3) {
				System.out.printf("%c", ch);
			}

			else if (i >= 4) {
				if (i == 4
					&& (j == 3 || j == 4)) {
					System.out.printf("%c", ch);
				}

				else if (j == i - 2
						|| j == i - 3) {
					System.out.printf("%c", ch);
				}
				else
					System.out.printf(" ");
			}
			else
				System.out.printf(" ");
		}
		System.out.printf("\n");
	}
}

// Function to print the letter S
static void s()
{
	System.out.printf("\n");
	for (int i = 0; i < 8; i++) {
		System.out.printf(" ");
		for (int j = 0; j < 7; j++) {
			if (i == 0 && j > 0) {
				System.out.printf("%c", ch);
			}
			else if (i > 0 && i < 3
					&& j < 2) {
				System.out.printf("%c", ch);
			}
			else if (i == 3 && j > 0
					&& j < 6) {
				System.out.printf("%c", ch);
			}
			else if (i > 3 && i < 6
					&& j > 4) {
				System.out.printf("%c", ch);
			}
			else if (i == 6 && j < 6) {
				System.out.printf("%c", ch);
			}

			else
				System.out.printf(" ");
		}
		System.out.printf("\n");
	}
}

// Function to print the letter T
static void t()
{
	System.out.printf("\n");
	for (int i = 0; i < 8; i++) {

		System.out.printf(" ");
		for (int j = 0; j < 8; j++) {

			if (i < 2 && j < 8) {
				System.out.printf("%c", ch);
			}

			if (i > 1 && j < 3)
				System.out.printf(" ");
			if (i > 1 && j > 2
				&& j < 5) {
				System.out.printf("%c", ch);
			}
			if (i > 1 && j > 4)
				System.out.printf(" ");
		}
		System.out.printf("\n");
	}
}

// Function to print the letter U
static void u()
{
	System.out.printf("\n");
	for (int i = 0; i < 8; i++) {
		System.out.printf(" ");

		for (int j = 0; j < 8; j++) {
			if (i < 7 && (j < 2 || j > 5)) {
				System.out.printf("%c", ch);
			}
			else if (i == 7
					&& (j == 0 || j == 7))
				System.out.printf(" ");
			else if (i > 5) {
				System.out.printf("%c", ch);
			}
			else
				System.out.printf(" ");
		}
		System.out.printf("\n");
	}
}

// Function to print the letter V
static void v()
{
	System.out.printf("\n");
	for (int i = 0; i < 8; i++) {
		System.out.printf(" ");
		for (int j = 0; j < 8; j++)
			if ((j == 0 || j == 7)
				&& i < 4) {
				System.out.printf("%c", ch);
			}
			else if ((j == i - 4 || j == 11 - i)
					&& i >= 4) {
				System.out.printf("%c", ch);
			}
			else
				System.out.printf(" ");
		System.out.printf("\n");
	}
}

// Function to print the letter W
static void w()
{
	System.out.printf("\n");
	for (int i = 0; i < 8; i++) {
		System.out.printf(" ");
		for (int j = 0; j < 8; j++) {
			if (j == 0 || j == 7) {
				System.out.printf("%c", ch);
			}
			else if (i > 3
					&& (j == 7 - i || j == i)) {
				System.out.printf("%c", ch);
			}
			else
				System.out.printf(" ");
		}
		System.out.printf("\n");
	}
}

// Function to print the letter X
static void x()
{
	System.out.printf("\n");
	for (int i = 0; i < 8; i++) {
		System.out.printf(" ");
		for (int j= 0; j< 8; j++) {
			if (i == j|| j== 7 - i) {
				System.out.printf("%c", ch);
			}
			else
				System.out.printf(" ");
		}

		System.out.printf("\n");
	}
}

// Function to print the letter Y
static void y()
{
	System.out.printf("\n");
	for (int i = 0; i < 8; i++) {
		System.out.printf(" ");

		for (int j = 0; j < 8; j++) {
			if (i < 4) {
				if (j == i || j == i + 1
					|| j == 6 - i || j == 7 - i) {
					System.out.printf("%c", ch);
				}
				else
					System.out.printf(" ");
			}
			else if (j == 3 || j == 4) {
				System.out.printf("%c", ch);
			}
			else
				System.out.printf(" ");
		}
		System.out.printf("\n");
	}
}

// Function to print the letter Z
static void z()
{
	System.out.printf("\n");

	for (int i = 0; i < 8; i++) {
		System.out.printf(" ");
		for (int j = 0; j < 8; j++) {
			if (i == 0 || i == 7) {
				System.out.printf("%c", ch);
			}
			else if (j == 7 - i) {
				System.out.printf("%c", ch);
			}
			else
				System.out.printf(" ");
		}
		System.out.printf("\n");
	}
}

// Function to print the required pattern
// by taking out each characters in it

    
    static void printPattern(char[] str)
    {
    
	int in = 0;

	while (in<str.length) {

		char ch = str[in];
		if (ch < 95)
			ch = (char) (ch + 32);
		switch (ch) {
		case 'a':
			a();
			break;
		case 'b':
			b();
			break;
		case 'c':
			c();
			break;
		case 'd':
			d();
			break;
		case 'e':
			e();
			break;
		case 'f':
			f();
			break;
		case 'g':
			g();
			break;
		case 'h':
			h();
			break;
		case 'i':
			i();
			break;
		case 'j':
			j();
			break;
		case 'k':
			k();
			break;
		case 'l':
			l();
			break;
		case 'm':
			m();
			break;
		case 'n':
			n();
			break;
		case 'o':
			o();
			break;
		case 'p':
			p();
			break;
		case 'q':
			q();
			break;
		case 'r':
			r();
			break;
		case 's':
			s();
			break;
		case 't':
			t();
			break;
		case 'u':
			u();
			break;
		case 'v':
			v();
			break;
		case 'w':
			w();
			break;
		case 'x':
			x();
			break;
		case 'y':
			y();
			break;
		case 'z':
			z();
			break;
		default:
		System.out.println("*****OOPS! Please Enter a Valid Alphabet to Print any word*****");
		System.out.println("-----Try again Latter-----");
			break;
		}
		in++;
	}
}

// Driver code
public static void main(String[] args)
{
    ch = '*';
    Scanner sc = new Scanner(System.in);

        // Taking user input
		System.out.println("*****Welcome to the Print Word Program*****");
        System.out.print("Enter a name or word: ");
        String ch = sc.nextLine().toUpperCase();

        char[] str = ch.toCharArray();
        printPattern(str);
	
}
}


