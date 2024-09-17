package com.project.board.mapper;

import com.project.board.dto.BoardDTO;
import com.project.board.dto.BoardFileDTO;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface BoardMapper {

    public void save(BoardDTO boardDTO);

    public List<BoardDTO> findAll();

    public void updateHits(Long id);

    public BoardDTO findById(Long id);

    public void update(BoardDTO boardDTO);

    public void delete(Long id);

    public void saveFile(BoardFileDTO boardFileDTO);

    public List<BoardFileDTO> findFile(Long id);

    public List<BoardDTO> pagingList(Map<String, Integer> pagingParams);
    
    public int boardCount();
}
