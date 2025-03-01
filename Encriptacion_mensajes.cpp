#include <iostream>
#include <string>
#include <cctype>
using namespace std;
int distancia_posiciones_hasta_p(string texto);
int contar_vocales(string texto);
string descifrar_texto(string texto);
int main(){
    string texto;
    string texto_descifrado;
    bool salir = false;
    
    while (salir == false)
    {
        getline(cin, texto);
        int numero_vocales = 0;
        texto[0] = tolower(texto[0]);
        if (texto[0] == 'p')
        {
            numero_vocales = contar_vocales(texto);
            cout << numero_vocales << "\n";
        }
        else{
            texto_descifrado = descifrar_texto(texto);
            if (texto_descifrado == "pFIN")
            {
                salir = true;
            }
            else{
                numero_vocales = contar_vocales(texto_descifrado);
                cout << numero_vocales << "\n";
            }
        }
    }
    return 0;
}

//Funciones:

int distancia_posiciones_hasta_p(string texto){
    int distancia;
    if (texto[0] < 'p')
    {
        distancia = 'p' - texto[0];
    }
    else if (texto[0] > 'p')
    {
        distancia = 'p' - texto[0];
    }
    return distancia;
}

int contar_vocales(string texto){
    int contadorVocales = 0;
    for (size_t i = 0; i < texto.size(); i++)
    {
        if (texto[i] == 'a' || texto[i] == 'e' || texto[i] == 'i' || texto[i] == 'o' || texto[i] == 'u' || texto[i] == 'A' || texto[i] == 'E' || texto[i] == 'I' || texto[i] == 'O' || texto[i] == 'U')
        {
            contadorVocales ++;
        } 
    }
    return contadorVocales;
}

string descifrar_texto(string texto){
    int distancia = distancia_posiciones_hasta_p(texto);
    for (int i = 0; i < texto.size(); i++)
    {
        if (texto[i] > 96 && texto[i] < 123) 
        {
            texto[i] = toupper(texto[i]);
            texto[i] = texto[i] + distancia;
            if (texto[i] > 'Z')
            {
                texto[i] = ('A' + (texto[i] - 'Z') - 1);
            }
            else if (texto[i] < 'A')
            {
                texto[i] = ('[' - ('A' - texto[i]));
            }
            texto[i] = tolower(texto[i]);  
        }
        else if (texto[i] > 64 && texto[i] < 91)
        {
            texto[i] = texto[i] + distancia;
            if (texto[i] > 'Z')
            {
                texto[i] = ('A' + (texto[i] - 'Z') - 1);
            }
            else if (texto[i] < 'A')
            {
                texto[i] = ('[' - ('A' - texto[i]));
            }
        }     
    }
    return texto;
}

