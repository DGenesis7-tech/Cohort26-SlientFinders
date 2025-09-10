from operator import index


def update_dictionary(courses):
    count = 1
    student_info = {}
    name = input("Enter name: ")
    age = int(input("Enter age: "))
    city = input("enter your city: ")
    zip_code = int(input("enter your zip code: "))
    offered_courses = set()
    while True:
        course = input("Enter course: ").lower()
        if course in [c.lower() for c in courses]:
            if course.lower() not in offered_courses:
                offered_courses.add(course)
                print("course added: " + course)
            else:
                print("Student offers course already")
        else:
            print("Invalid course, course not in library")
        choice = input("Add more courses (yes/no): ").lower()
        if choice == "no":
            print("Courses updated")
            break

    address = {'City': city, 'Zip_code': zip_code}
    student_key = f"student{count}"
    student_info[student_key] = {
        'Name': name,
        'Age': age,
        'Courses': offered_courses,
        'Address': address
    }
    count += 1
    return student_info


courses = {"Math", "Physics", "Computer Science", "Biology", "Chemistry", "Statistics", "English", "Economics",
           "History", "Philosophy",
           "Sociology", "Political Science", "Geography", "Psychology", "Art", "Music", "Engineering", "Law",
           "Medicine", "Business"}

count = 1
student_info = update_dictionary(courses)
student_key = f"student{count}"
print({values: [index] for values in student_info[student_key]})

