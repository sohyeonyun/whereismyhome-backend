package com.ssafy.home.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.home.model.MapAptLocationDTO;
import com.ssafy.home.model.MapDTO;
import com.ssafy.home.model.MapDongLocationDTO;
import com.ssafy.home.model.MapSearchOptionDTO;
import com.ssafy.home.model.service.MapService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/map")
@Api("Map Controller API V1")
public class MapController {

	public static final Logger logger = LoggerFactory.getLogger(MapController.class);
	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";

	@Autowired
	private MapService mapService;

//	listMapLocation
	@GetMapping("/dong/{name}")
	@ApiOperation(value = "시 구군 동 목록", response = ArrayList.class)
	public ResponseEntity<?> mapDongLocationList(
			@PathVariable("name") @ApiParam(value = "시 구군 동 검색 이름.", required = true) String name) {
		logger.info("mapDongLocationList - 호출");
		logger.info("mapDongLocationList name : {}", name);

		try {
			ArrayList<MapDongLocationDTO> list = mapService.listMapDongLocation(name);
			logger.info("mapDongLocationList list : {} ", list);
			return new ResponseEntity<ArrayList>(list, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
		}
	}
	
//	listMapLocation
	@GetMapping("/apt/{name}")
	@ApiOperation(value = "아파트 목록", response = ArrayList.class)
	public ResponseEntity<?> mapAptLocationList(
			@PathVariable("name") @ApiParam(value = "아파트 검색 이름.", required = true) String name) {
		logger.info("mapAptLocationList - 호출");
		logger.info("mapAptLocationList name : {}", name);

		try {
			ArrayList<MapAptLocationDTO> list = mapService.listMapAptLocation(name);
			logger.info("mapAptLocationList list : {} ", list);
			return new ResponseEntity<ArrayList>(list, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
		}
	}
	

//	listMapDong
	@PostMapping("/dong/{dongcode}")
	@ApiOperation(value = "지역 선택 시 매매 목록", response = ArrayList.class)
	public ResponseEntity<?> mapDongList(
			@PathVariable("dongcode") @ApiParam(value = "선택한 지역.", required = true) String dongCode,
			@RequestBody @ApiParam(value = "추가 옵션(최소 거래금액, 최대 거래금액, 최소 크기, 최대 크기, 거래일)", required = true) MapSearchOptionDTO dto) {
		logger.info("mapDongList - 호출");
		logger.info("mapDongList dongCode : {}", dongCode);
		logger.info("mapDongList dto : {}", dto);

		Map<String, Object> map = new HashMap<>();
		map.put("dongCode", dongCode);
		map.put("lowDealAmount", dto.getLowDealAmount());
		map.put("highDealAmount", dto.getHighDealAmount());
		map.put("lowArea", dto.getLowArea());
		map.put("highArea", dto.getHighArea());
		map.put("year", dto.getYear());
		
		try {
			ArrayList<MapDTO> list = mapService.listMapDong(map);
			logger.info("mapDongList map : {} ", map);
			return new ResponseEntity<ArrayList>(list, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
		}
	}

//	listMapApt
	@PostMapping("/apt/{aptcode}")
	@ApiOperation(value = "아파트 선택 시 매매 목록", response = ArrayList.class)
	public ResponseEntity<?> mapAptList(
			@PathVariable("aptcode") @ApiParam(value = "선택한 아파트.", required = true) String aptCode,
			@RequestBody @ApiParam(value = "추가 옵션(최소 거래금액, 최대 거래금액, 최소 크기, 최대 크기, 거래일)", required = true) MapSearchOptionDTO dto) {
		logger.info("mapAptList - 호출");
		logger.info("mapAptList apartCode : {}", aptCode);
		logger.info("mapAptList dto : {}", dto);
		
		Map<String, Object> map = new HashMap<>();
		map.put("aptCode", aptCode);
		map.put("lowDealAmount", dto.getLowDealAmount());
		map.put("highDealAmount", dto.getHighDealAmount());
		map.put("lowArea", dto.getLowArea());
		map.put("highArea", dto.getHighArea());
		map.put("year", dto.getYear());
		
		try {
			ArrayList<MapDTO> list = mapService.listMapApt(map);
			logger.info("mapAptList map : {} ", map);
			return new ResponseEntity<ArrayList>(list, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
		}
	}
}
