package entity;

import java.util.Iterator;

public class Calculadora {

	private int num1;
	private int num2;

	public Calculadora() {

	}

	public Calculadora(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public int soma() {
		return num1 + num2;
	}

	public int resto() {
		return 9 % 3;
	}

	public int calValorX() {
		int n = 1;
		int x = 0;
		int i;
		while (n < 10) {
			if (n % 2 != 0) {
				for (i = 3; i * i <= n; i += 2) {
					if (n % i == 0) {
						break;
					}
				}
				if (i < n) {
					x++;
				}
			}
			n++;
		}
		return x;
	}
}
