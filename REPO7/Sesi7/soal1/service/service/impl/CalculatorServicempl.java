package service. impl;

import service. CalculatorService;

public class CalculatorServiceImpl implements CalculatorService{

		@override
		public Integer tambah(int bil1, int bil2) {
			return bil1 + bil2;
		}
		
		@override
		public Integer kurang(int bil1, int bil2) {
			return bil1 - bil2;
		}
		
		@override
		public Integer kali(int bil1, int bil2) {
			return bil1 * bil2;
		}
		
		@override
		public Integer bagi(int bil1, int bil2) {
			return il1 / bil2;
		}
	}