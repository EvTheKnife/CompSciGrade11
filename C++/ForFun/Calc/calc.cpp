#include <iostream>
using namespace std;

int main() {

    int option, x, y;

    cout << "Select your option: ";
    cin >> option;

	cout << "Enter your values: ";
    cin >> x;
    cin >> y;

    if (option == 1) {
        cout << x * y;
    } else if (option == 2) {
        cout << x * y;
    } else if (option == 3) {
		cout << x + y;
    } else if (option == 4) {
        cout << x - y;
    } else {
        cout << "try again";
	}
    return 0;
}