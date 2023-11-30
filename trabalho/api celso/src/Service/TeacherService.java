package Service;
import DAO.ConnectionDB;
import DAO.ProfessorDAO;
import Domain.teacher.CreateTeacher;
import Domain.teacher.Teacher;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
public class TeacherService {
    private final ProfessorDAO professorDAO;

    public TeacherService() {
        this.professorDAO = new ProfessorDAO();
    }

    // Método para criar um professor
    public void createTeacher(CreateTeacher createTeacher) throws SQLException {
        try (Connection connection = ConnectionDB.getConnection()) {
            professorDAO.createTeacher(connection, createTeacher);
        }
    }

    // Método para obter um professor pelo ID
    public Teacher getTeacherById(int teacherId) throws SQLException {
        try (Connection connection = ConnectionDB.getConnection()) {
            return professorDAO.getTeacherById(connection, teacherId);
        }
    }

    // Método para obter todos os professores
    public List<Teacher> getAllTeachers() throws SQLException {
        try (Connection connection = ConnectionDB.getConnection()) {
            return professorDAO.getAllTeachers(connection);
        }
    }

    // Método para atualizar informações de um professor
    public void updateTeacher(int teacherId, CreateTeacher createTeacher) throws SQLException {
        try (Connection connection = ConnectionDB.getConnection()) {
            professorDAO.updateTeacher(connection, teacherId, createTeacher);
        }
    }

    // Método para excluir um professor pelo ID
    public void deleteTeacher(int teacherId) throws SQLException {
        try (Connection connection = ConnectionDB.getConnection()) {
            professorDAO.deleteTeacher(connection, teacherId);
        }
    }
}
