package kr.ac.univ.lab.repository;

import kr.ac.univ.lab.domain.Board;
import kr.ac.univ.lab.domain.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {
	Board findByUser(User user);
}


