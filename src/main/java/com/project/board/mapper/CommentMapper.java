package com.project.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.project.board.dto.CommentDTO;


@Mapper
public interface CommentMapper {
	
	public void save(CommentDTO commentDTO);

	public List<CommentDTO> findAll(Long boardId);
	
}
