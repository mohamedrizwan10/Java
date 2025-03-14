#include <iostream>
#include <vector>
using namespace std;

class College {
    public:
    string ClgName;
    vector<string> Departments;

    // Constructor
    College(string name, vector<string> depts) {
        ClgName = name;
        Departments = depts;
    }

    // Function to display departments
    void displayDepartments() {
        cout << "Departments available at " << ClgName << ":" << endl;
        for (string dept : Departments) {
            cout << "- " << dept << endl;
        }
    }
};

int main() {
    // Creating a College Object with Departments
    vector<string> depts = {"Computer Science", "Electronics", "Electrical", "Mechanical", "Civil", "Information Technology"};
    College DACE("Daanish Ahmed College of Engineering", depts);

    // Display Departments
    DACE.displayDepartments();

    return 0;
}
