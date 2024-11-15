package com.loras.infra.codegroup;

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
public class CodeGroupService {
	@Autowired
	public CodeGroupDao CodeGroupDao;
	@Autowired
	public S3Config s3Config;

	@Value("${cloud.aws.s3.bucket}")
	private String bucket;

//	public List<CodeGroupDto> selectList(){
//		List<CodeGroupDto> CodeGroups = CodeGroupDao.selectList();
//		return CodeGroups;
//	}

//	안에 내용이 없을때
	public List<CodeGroupDto> selectList(CodeGroupVo vo) {
		return CodeGroupDao.selectList(vo);
	}

	public int insert(CodeGroupDto codeGroupDto) throws Exception {

		MultipartFile[] multipartFiles = codeGroupDto.getUploadFiles();
		for (int i = 0; i < multipartFiles.length; i++) {
			AmazonS3Client amazonS3Client = s3Config.amazonS3Client();

			if (!multipartFiles[i].isEmpty()) {

				String className = codeGroupDto.getClass().getSimpleName().toString().toLowerCase();
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
				int type = 1;
				String path = pathModule + "/" + type + "/" + pathDate + "/";
				System.out.println("path :" + path);
//				String pathForView = Constants.UPLOADED_PATH_PREFIX_FOR_VIEW_LOCAL + "/" + pathModule + "/" + type + "/" + pathDate + "/";

				ObjectMetadata metadata = new ObjectMetadata();
				metadata.setContentLength(multipartFiles[i].getSize());
				metadata.setContentType(multipartFiles[i].getContentType());

				amazonS3Client.putObject(bucket, path + uuidFileName, multipartFiles[i].getInputStream(), metadata);

				String objectUrl = amazonS3Client.getUrl(bucket, path + uuidFileName).toString();

//				
//				  codeGroupDto.setPath(objectUrl); codeGroupDto.setOriginalName(fileName);
//				  codeGroupDto.setUuId(uuidFileName); codeGroupDto.setExt(ext);
//				  codeGroupDto.setSize(multipartFiles[i].getSize());
////				  codeGroupDto.setTableName(tableName); codeGroupDto.setType(type); //
//				  codeGroupDto.setDefaultNy(0); codeGroupDto.setSort(maxNumber + i);
//				  codeGroupDto.setpSeq(cgSeq);
//				  
//				  codeGroupDto.insertUploaded(codeGroupDto);
				 

			}
		}
		return CodeGroupDao.insert(codeGroupDto);
	}

	public CodeGroupDto selectOne(CodeGroupDto codeGroupDto) {

		return CodeGroupDao.selectOne(codeGroupDto);
	}

	public int update(CodeGroupDto codeGroupDto) throws Exception {

			MultipartFile[] multipartFiles = codeGroupDto.getUploadFiles();
			for (int i = 0; i < multipartFiles.length; i++) {
				AmazonS3Client amazonS3Client = s3Config.amazonS3Client();

				if (!multipartFiles[i].isEmpty()) {

					String className = codeGroupDto.getClass().getSimpleName().toString().toLowerCase();
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
					int type = 1;
					String path = pathModule + "/" + type + "/" + pathDate + "/";
					System.out.println("path :" + path);
//					String pathForView = Constants.UPLOADED_PATH_PREFIX_FOR_VIEW_LOCAL + "/" + pathModule + "/" + type + "/" + pathDate + "/";

					ObjectMetadata metadata = new ObjectMetadata();
					metadata.setContentLength(multipartFiles[i].getSize());
					metadata.setContentType(multipartFiles[i].getContentType());

					amazonS3Client.putObject(bucket, path + uuidFileName, multipartFiles[i].getInputStream(), metadata);

					String objectUrl = amazonS3Client.getUrl(bucket, path + uuidFileName).toString();

//					
//					  codeGroupDto.setPath(objectUrl); codeGroupDto.setOriginalName(fileName);
//					  codeGroupDto.setUuId(uuidFileName); codeGroupDto.setExt(ext);
//					  codeGroupDto.setSize(multipartFiles[i].getSize());
////					  codeGroupDto.setTableName(tableName); codeGroupDto.setType(type); //
//					  codeGroupDto.setDefaultNy(0); codeGroupDto.setSort(maxNumber + i);
//					  codeGroupDto.setpSeq(cgSeq);
//					  
//					  codeGroupDto.insertUploaded(codeGroupDto);
					 

				}
			}
		return CodeGroupDao.update(codeGroupDto);
	}

	public int uelete(CodeGroupDto codeGroupDto) {
		return CodeGroupDao.uelete(codeGroupDto);
	}

	public int delete(CodeGroupDto codeGroupDto) {
		return CodeGroupDao.delete(codeGroupDto);
	}

	public int selectOneCount(CodeGroupVo vo) {
		return CodeGroupDao.selectOneCount(vo);
	}

}
