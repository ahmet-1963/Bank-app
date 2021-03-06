
public class KrediKarti {
		//Sınıfmızın özellikleri
		int kartNumarasi;
		double limit;
		double guncelBorc;
		double kullanılabilirLimit;
		
		//Sınıfmızın yapıcı metodu
		public KrediKarti(double limit, double guncelBorc) {
			super();
			this.limit = limit;
			this.guncelBorc = guncelBorc;
		}

		@Override
		public String toString() {
			return "BankaHesabi [kartNumarasi=" + kartNumarasi + ", limit=" + limit + ", guncelBorc=" + guncelBorc
					+ ", kullanılabilirLimit=" + kullanılabilirLimit + "]";
		}

		//@GETTER @SETTER
		public int getKartNumarasi() {
			return kartNumarasi;
		}

		public void setKartNumarasi(int kartNumarasi) {
			this.kartNumarasi = kartNumarasi;
		}

		public double getLimit() {
			return limit;
		}

		public void setLimit(double limit) {
			this.limit = limit;
		}

		public double getGuncelBorc() {
			return guncelBorc;
		}

		public void setGuncelBorc(double guncelBorc) {
			this.guncelBorc = guncelBorc;
		}

		public double getKullanılabilirLimit() {
			return kullanılabilirLimit;
		}

		public void setKullanılabilirLimit(double kullanılabilirLimit) {
			this.kullanılabilirLimit = kullanılabilirLimit;
		}
		

}
