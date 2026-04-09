private static void
buildStudentProfile(){
    System.out.println(" ---Build Student Profile--- ");
    Student s = pickStudent();
    if(s==null) return;

    System.out.print(" New Name (ENTER to Skip): ");
    String name = sc.nextLine().trim();
    System.out.print(" New Email (ENTER to Skip): ");
    String email = sc.nextLine.trim();
    System.out.print(" Program (ENTER to Skip): ");
    String prog + sc.nextLine.trim();

    if(!name.is.Empty())
        s.setName(name);
    if(!email.is.Empty())
        s.setEmail(email);
    if(!prog.is.Empty())
        s.setProgram(prog);

    System.out.println("\n Profile updated: " + s);
    pause();
}