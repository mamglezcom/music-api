package com.mamglez.api.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mamglez.api.entity.Album;
import com.mamglez.api.repository.IAlbumsRepository;
import com.mamglez.api.service.IAlbumsService;

@Service
public class AlbumService implements IAlbumsService {
	
	@Autowired
	private IAlbumsRepository albumsRepo;

	@Override
	public List<Album> buscarTodos() {
		return albumsRepo.findAll();
	}

	@Override
	public void guardar(Album album) {
		albumsRepo.save(album);
	}

	@Override
	public void eliminar(int idAlbum) {
		albumsRepo.deleteById(idAlbum);
	}

}
