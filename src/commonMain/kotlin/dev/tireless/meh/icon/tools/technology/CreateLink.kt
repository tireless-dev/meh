// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CreateLink: ImageVector
  get() {
    val current = _createLink
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CreateLink",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M7 8 v3 H5 V8 H2 V6 h3 V3 h2 v3 h3 v2z m15.42 18.01 6.03 -6.03 a5.25 5.25 0 1 0 -7.44 -7.44 l1.41 1.41 a3.3 3.3 0 0 1 4.62 0 3.3 3.3 0 0 1 0 4.62 l-6.03 6.03 a3.3 3.3 0 0 1 -4.62 0 3.3 3.3 0 0 1 0 -4.62 l-1.41 -1.41 a5.27 5.27 0 0 0 7.45 7.45z m-8.43 2.45 -1.41 -1.41 a3.27 3.27 0 0 1 -4.62 -4.62 l6.03 -6.03 .02 -.02 a3.27 3.27 0 0 1 4.6 4.64 l1.41 1.41 .03 -.03 a5.26 5.26 0 1 0 -7.47 -7.41 l-6.03 6.03 a5.27 5.27 0 1 0 7.44 7.44
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 7 8
          moveTo(x = 7.0f, y = 8.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // H 5
          horizontalLineTo(x = 5.0f)
          // V 8
          verticalLineTo(y = 8.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // V 3
          verticalLineTo(y = 3.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 2z
          verticalLineToRelative(dy = 2.0f)
          close()
          // m 15.42 18.01
          moveToRelative(dx = 15.42f, dy = 18.01f)
          // l 6.03 -6.03
          lineToRelative(dx = 6.03f, dy = -6.03f)
          // a 5.25 5.25 0 1 0 -7.44 -7.44
          arcToRelative(
            a = 5.25f,
            b = 5.25f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -7.44f,
            dy1 = -7.44f,
          )
          // l 1.41 1.41
          lineToRelative(dx = 1.41f, dy = 1.41f)
          // a 3.3 3.3 0 0 1 4.62 0
          arcToRelative(
            a = 3.3f,
            b = 3.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.62f,
            dy1 = 0.0f,
          )
          // a 3.3 3.3 0 0 1 0 4.62
          arcToRelative(
            a = 3.3f,
            b = 3.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 4.62f,
          )
          // l -6.03 6.03
          lineToRelative(dx = -6.03f, dy = 6.03f)
          // a 3.3 3.3 0 0 1 -4.62 0
          arcToRelative(
            a = 3.3f,
            b = 3.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.62f,
            dy1 = 0.0f,
          )
          // a 3.3 3.3 0 0 1 0 -4.62
          arcToRelative(
            a = 3.3f,
            b = 3.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -4.62f,
          )
          // l -1.41 -1.41
          lineToRelative(dx = -1.41f, dy = -1.41f)
          // a 5.27 5.27 0 0 0 7.45 7.45z
          arcToRelative(
            a = 5.27f,
            b = 5.27f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 7.45f,
            dy1 = 7.45f,
          )
          close()
          // m -8.43 2.45
          moveToRelative(dx = -8.43f, dy = 2.45f)
          // l -1.41 -1.41
          lineToRelative(dx = -1.41f, dy = -1.41f)
          // a 3.27 3.27 0 0 1 -4.62 -4.62
          arcToRelative(
            a = 3.27f,
            b = 3.27f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.62f,
            dy1 = -4.62f,
          )
          // l 6.03 -6.03
          lineToRelative(dx = 6.03f, dy = -6.03f)
          // l 0.02 -0.02
          lineToRelative(dx = 0.02f, dy = -0.02f)
          // a 3.27 3.27 0 0 1 4.6 4.64
          arcToRelative(
            a = 3.27f,
            b = 3.27f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.6f,
            dy1 = 4.64f,
          )
          // l 1.41 1.41
          lineToRelative(dx = 1.41f, dy = 1.41f)
          // l 0.03 -0.03
          lineToRelative(dx = 0.03f, dy = -0.03f)
          // a 5.26 5.26 0 1 0 -7.47 -7.41
          arcToRelative(
            a = 5.26f,
            b = 5.26f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -7.47f,
            dy1 = -7.41f,
          )
          // l -6.03 6.03
          lineToRelative(dx = -6.03f, dy = 6.03f)
          // a 5.27 5.27 0 1 0 7.44 7.44
          arcToRelative(
            a = 5.27f,
            b = 5.27f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 7.44f,
            dy1 = 7.44f,
          )
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
      .also { _createLink = it }
  }

@Suppress("ObjectPropertyName")
private var _createLink: ImageVector? = null
