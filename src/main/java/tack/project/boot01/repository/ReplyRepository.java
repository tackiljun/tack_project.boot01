package tack.project.boot01.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import tack.project.boot01.domain.Reply;


public interface ReplyRepository extends JpaRepository<Reply, Long> {

    ////////////////////////////////////////////////////////////////////////////
    @Query("select r from Reply r where r.board.bno =:bno ") //=:bno 는 붙여쓴다.
    Page<Reply> listBoard(@Param("bno") Long bno, Pageable pageable);

    ////////////////////////////////////////////////////////////////////////////
    @Query("select count(r) from Reply r where r.board.bno =:bno ")
    long getCountBoard(@Param("bno") Long bno);
    
}
