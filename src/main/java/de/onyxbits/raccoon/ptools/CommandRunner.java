/*
 * Copyright 2016 Patrick Ahlbrecht
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.onyxbits.raccoon.ptools;

/**
 * For running shell commands on a background thread;
 * 
 * @author patrick
 * 
 */
class CommandRunner implements Runnable {

	private Device device;
	private String cmd;

	public CommandRunner(Device device, String cmd) {
		this.device = device;
		this.cmd = cmd;
	}

	@Override
	public void run() {
		try {
			device.exec(cmd);
		}
		catch (Exception e) {

		}
	}

}
