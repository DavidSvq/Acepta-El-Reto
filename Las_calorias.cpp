#include <iostream>
#include <sstream>

using namespace std;

int main(){
    int e, n1, n_e = 0, suma = 0;
    string entradas;
    cin >> e;
    while (e != 0){
        cin >> n1; cin.ignore();
        getline(cin, entradas);
        int c[n1];
        istringstream stream(entradas);
        for (int i = 0; i < n1; i++){
            stream >> c[i];
            suma += c[i];
        }
        n_e = suma / e;
        if (suma%e > 0){
            n_e++;
        }
        cout << n_e << "\n";
        n_e = 0;
        suma = 0;
        cin >> e;
    }
    return 0; 
}