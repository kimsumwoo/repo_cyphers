package com.loras.infra.product;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.loras.common.config.S3Config;
import com.loras.common.config.util.UtilDateTime;

@Service
public class ProductService {
	@Autowired
	public ProductDao productDao;
	@Autowired
	public S3Config s3Config;

	@Value("${cloud.aws.s3.bucket}")
	private String bucket;
	
	public List<ProductDto> productList(productVo vo){
		return productDao.productList(vo);
	}
	public int insert(ProductDto productDto) {
		return productDao.insert(productDto);
	}
	public ProductDto SelectOne(ProductDto productDto) {
		return productDao.SelectOne(productDto);
	}
	public int update(ProductDto productDto) throws Exception {
		int type = 1;
		MultipartFile[] multipartFiles = productDto.getUploadFiles();
		int maxNumber = multipartFiles.length;
		for (int i = 0; i < multipartFiles.length; i++) {
			AmazonS3Client amazonS3Client = s3Config.amazonS3Client();

			if (!multipartFiles[i].isEmpty()) {

				String className = productDto.getClass().getSimpleName().toString().toLowerCase();
				System.out.println("className : " + className);
				String fileName = multipartFiles[i].getOriginalFilename();
				System.out.println("fileName : " + fileName);
				String ext = fileName.substring(fileName.lastIndexOf(".") + 1);
				System.out.println("ext :" + ext);
				String uuid = UUID.randomUUID().toString();
				System.out.println("uuId: " + uuid);
				String uuidFileName = uuid + "." + ext;
				System.out.println("uuidFileName :" + uuidFileName);
				String pathModule = className;
				System.out.println("pathModule :" + pathModule);
				String nowString = UtilDateTime.nowString();
				System.out.println("nowString :" + nowString);
				String pathDate = nowString.substring(0, 4) + "/" + nowString.substring(5, 7) + "/"
						+ nowString.substring(8, 10);
				System.out.println("pathDate :" + pathDate);		
				String path = pathModule + "/" + type + "/" + pathDate + "/";
				System.out.println("path :" + path);
//				String pathForView = Constants.UPLOADED_PATH_PREFIX_FOR_VIEW_LOCAL + "/" + pathModule + "/" + type + "/" + pathDate + "/";

				ObjectMetadata metadata = new ObjectMetadata();
				metadata.setContentLength(multipartFiles[i].getSize());
				metadata.setContentType(multipartFiles[i].getContentType());

				amazonS3Client.putObject(bucket, path + uuidFileName, multipartFiles[i].getInputStream(), metadata);

				String objectUrl = amazonS3Client.getUrl(bucket, path + uuidFileName).toString();

//				
				  productDto.setPath(objectUrl); productDto.setOriginalName(fileName);
				  productDto.setUuId(uuidFileName);
				  productDto.setExt(ext);
				  productDto.setSize(multipartFiles[i].getSize());
//				  productDto.setTableName(tableName);
				  productDto.setType(type);
//				  productDto.setDefaultNy();
				  productDto.setSort(maxNumber + i);
				  productDto.setpSeq(productDto.getPdSeq());
				  
				  productDao.insertUploaded(productDto);
				 

			}
		}
		return productDao.update(productDto);
	}
	public int delete(ProductDto productDto) {
		return productDao.delete(productDto);
	}
	public int selectOneCount(productVo vo) {
		return productDao.selectOneCount(vo);
	}
	public List<ProductDto> rvSelectList(ProductDto productDto){
		return productDao.rvSelectList(productDto);
	}
	public int insertWish(ProductDto productDto) {
		return productDao.insertWish(productDto);
	}
	public int deleteWish(ProductDto productDto) {
		return productDao.deleteWish(productDto);
	}
	public List<ProductDto> selectImgList(ProductDto productDto){
		return productDao.selectImgList(productDto);
	}
	public List<ProductDto> selectImgList2(ProductDto productDto){
		return productDao.selectImgList2(productDto);
	}

	
	

}
