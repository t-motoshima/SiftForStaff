package com.procast.shift.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.procast.shift.entity.week;
/**
 * ユーザー一覧用のService
 *
 * @author takata
 *
 */
@Service
public class weekServiceImpl implements WeekService {

	@Override
	public List<week> getWeekList() throws Exception {
		//ユーザー一覧を取得
		return null;
	}
}
