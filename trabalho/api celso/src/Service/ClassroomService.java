package Service;

import DAO.SaladeaulaDAO;
import DAO.ConnectionDB;
import Domain.classroom.Classroom;
import Domain.classroom.CreateClassroom;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class ClassroomService {
    private final SaladeaulaDAO saladeaulaDAO;

    public ClassroomService() {
        this.saladeaulaDAO = new SaladeaulaDAO();
    }

    // Método para criar uma sala de aula
    public void createClassroom(CreateClassroom createClassroom) throws SQLException {
        try (Connection connection = ConnectionDB.getConnection()) {
            saladeaulaDAO.createClassroom(connection, createClassroom);
        }
    }

    // Método para obter uma sala de aula pelo ID
    public Classroom getClassroomById(int classroomId) throws SQLException {
        try (Connection connection = ConnectionDB.getConnection()) {
            return saladeaulaDAO.getClassroomById(connection, classroomId);
        }
    }

    // Método para obter todas as salas de aula
    public List<Classroom> getAllClassrooms() throws SQLException {
        try (Connection connection = ConnectionDB.getConnection()) {
            return saladeaulaDAO.getAllClassrooms(connection);
        }
    }

    // Método para atualizar informações de uma sala de aula
    public void updateClassroom(int classroomId, CreateClassroom createClassroom) throws SQLException {
        try (Connection connection = ConnectionDB.getConnection()) {
            saladeaulaDAO.updateClassroom(connection, classroomId, createClassroom);
        }
    }

    // Método para excluir uma sala de aula pelo ID
    public void deleteClassroom(int classroomId) throws SQLException {
        try (Connection connection = ConnectionDB.getConnection()) {
            saladeaulaDAO.deleteClassroom(connection, classroomId);
        }
    }
}
