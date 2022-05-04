/**
 *
 *  @author Faron Daniel PD3748
 *
 */

package zad3;


public class BooksOnShelves {
	
	int numOfBooks;
    int shelfCap;
	
	public BooksOnShelves(int numOfBooks, int shelfCap) {
		this.numOfBooks = numOfBooks;
		this.shelfCap = shelfCap;
	}
	
	
	
	public int getNumOfShelves() {
		
		
		if (this.shelfCap == 0) {
			return 0;
		}
		
		else {
			int a = this.numOfBooks%this.shelfCap;
			if (a>0) {
				return this.numOfBooks/this.shelfCap+1;
			}
			else {
				return this.numOfBooks/this.shelfCap;
				}
		}
		
	}
	
	public int getBooksOnLastShelf() {
		if (this.shelfCap == 0) {
			return 0;
			}
		else {
			int b = this.numOfBooks%this.shelfCap;
			
				if (b>0) {
					return this.numOfBooks%this.shelfCap;
				}
				else {
					return this.shelfCap;
				}
			}
		}

}
	
	

