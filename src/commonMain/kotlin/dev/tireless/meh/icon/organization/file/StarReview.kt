// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val StarReview: ImageVector
  get() {
    val current = _starReview
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.StarReview",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="8" height="2" x="18.0" y="26.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 26
          moveTo(x = 18.0f, y = 26.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -8z
          horizontalLineToRelative(dx = -8.0f)
          close()
        }
        // <rect width="12" height="2" x="18.0" y="22.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 22
          moveTo(x = 18.0f, y = 22.0f)
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -12z
          horizontalLineToRelative(dx = -12.0f)
          close()
        }
        // <rect width="12" height="2" x="18.0" y="18.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 18
          moveTo(x = 18.0f, y = 18.0f)
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -12z
          horizontalLineToRelative(dx = -12.0f)
          close()
        }
        // <polygon points="20.549 11.217 16.0 2.0 11.451 11.217 1.28 12.695 8.64 19.87 6.902 30.0 14.0 26.269 14.0 24.009 9.559 26.344 10.611 20.208 10.789 19.171 10.036 18.438 5.578 14.091 11.739 13.196 12.779 13.045 13.245 12.102 16.0 6.519 18.755 12.102 19.221 13.045 20.261 13.196 27.715 14.281 28.0 12.3 20.549 11.217" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20.549 11.217
          moveTo(x = 20.549f, y = 11.217f)
          // L 16 2
          lineTo(x = 16.0f, y = 2.0f)
          // L 11.451 11.217
          lineTo(x = 11.451f, y = 11.217f)
          // L 1.28 12.695
          lineTo(x = 1.28f, y = 12.695f)
          // L 8.64 19.87
          lineTo(x = 8.64f, y = 19.87f)
          // L 6.902 30
          lineTo(x = 6.902f, y = 30.0f)
          // L 14 26.269
          lineTo(x = 14.0f, y = 26.269f)
          // L 14 24.009
          lineTo(x = 14.0f, y = 24.009f)
          // L 9.559 26.344
          lineTo(x = 9.559f, y = 26.344f)
          // L 10.611 20.208
          lineTo(x = 10.611f, y = 20.208f)
          // L 10.789 19.171
          lineTo(x = 10.789f, y = 19.171f)
          // L 10.036 18.438
          lineTo(x = 10.036f, y = 18.438f)
          // L 5.578 14.091
          lineTo(x = 5.578f, y = 14.091f)
          // L 11.739 13.196
          lineTo(x = 11.739f, y = 13.196f)
          // L 12.779 13.045
          lineTo(x = 12.779f, y = 13.045f)
          // L 13.245 12.102
          lineTo(x = 13.245f, y = 12.102f)
          // L 16 6.519
          lineTo(x = 16.0f, y = 6.519f)
          // L 18.755 12.102
          lineTo(x = 18.755f, y = 12.102f)
          // L 19.221 13.045
          lineTo(x = 19.221f, y = 13.045f)
          // L 20.261 13.196
          lineTo(x = 20.261f, y = 13.196f)
          // L 27.715 14.281
          lineTo(x = 27.715f, y = 14.281f)
          // L 28 12.3
          lineTo(x = 28.0f, y = 12.3f)
          // L 20.549 11.217z
          lineTo(x = 20.549f, y = 11.217f)
          close()
        }
        // <rect width="32" height="32" fill="#000" style="fill:none" />
        path(
          fill = SolidColor(Color.Transparent),
        ) {
          // M 0 0
          moveTo(x = 0.0f, y = 0.0f)
          // h 32
          horizontalLineToRelative(dx = 32.0f)
          // v 32
          verticalLineToRelative(dy = 32.0f)
          // h -32z
          horizontalLineToRelative(dx = -32.0f)
          close()
        }
      }.build()
      .also { _starReview = it }
  }

@Suppress("ObjectPropertyName")
private var _starReview: ImageVector? = null
