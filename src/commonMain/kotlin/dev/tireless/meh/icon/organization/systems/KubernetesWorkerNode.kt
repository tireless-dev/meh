// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val KubernetesWorkerNode: ImageVector
  get() {
    val current = _kubernetesWorkerNode
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.KubernetesWorkerNode",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M23 18 v-2 h-2.1 c-.1 -.6 -.4 -1.2 -.7 -1.8 l1.5 -1.5 -1.4 -1.4 -1.5 1.5 a5 5 0 0 0 -1.8 -.7 V10 h-2 v2.1 c-.6 .1 -1.2 .4 -1.8 .7 l-1.5 -1.5 -1.4 1.4 1.5 1.5 a5 5 0 0 0 -.7 1.8 H9 v2 h2.1 c.1 .6 .4 1.2 .7 1.8 l-1.5 1.5 1.4 1.4 1.5 -1.5 c.5 .3 1.1 .6 1.8 .7 V24 h2 v-2.1 c.6 -.1 1.2 -.4 1.8 -.7 l1.5 1.5 1.4 -1.4 -1.5 -1.5 c.3 -.5 .6 -1.1 .7 -1.8z m-7 2 c-1.7 0 -3 -1.3 -3 -3 s1.3 -3 3 -3 3 1.3 3 3 -1.3 3 -3 3
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23 18
          moveTo(x = 23.0f, y = 18.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -2.1
          horizontalLineToRelative(dx = -2.1f)
          // c -0.1 -0.6 -0.4 -1.2 -0.7 -1.8
          curveToRelative(
            dx1 = -0.1f,
            dy1 = -0.6f,
            dx2 = -0.4f,
            dy2 = -1.2f,
            dx3 = -0.7f,
            dy3 = -1.8f,
          )
          // l 1.5 -1.5
          lineToRelative(dx = 1.5f, dy = -1.5f)
          // l -1.4 -1.4
          lineToRelative(dx = -1.4f, dy = -1.4f)
          // l -1.5 1.5
          lineToRelative(dx = -1.5f, dy = 1.5f)
          // a 5 5 0 0 0 -1.8 -0.7
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.8f,
            dy1 = -0.7f,
          )
          // V 10
          verticalLineTo(y = 10.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 2.1
          verticalLineToRelative(dy = 2.1f)
          // c -0.6 0.1 -1.2 0.4 -1.8 0.7
          curveToRelative(
            dx1 = -0.6f,
            dy1 = 0.1f,
            dx2 = -1.2f,
            dy2 = 0.4f,
            dx3 = -1.8f,
            dy3 = 0.7f,
          )
          // l -1.5 -1.5
          lineToRelative(dx = -1.5f, dy = -1.5f)
          // l -1.4 1.4
          lineToRelative(dx = -1.4f, dy = 1.4f)
          // l 1.5 1.5
          lineToRelative(dx = 1.5f, dy = 1.5f)
          // a 5 5 0 0 0 -0.7 1.8
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.7f,
            dy1 = 1.8f,
          )
          // H 9
          horizontalLineTo(x = 9.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2.1
          horizontalLineToRelative(dx = 2.1f)
          // c 0.1 0.6 0.4 1.2 0.7 1.8
          curveToRelative(
            dx1 = 0.1f,
            dy1 = 0.6f,
            dx2 = 0.4f,
            dy2 = 1.2f,
            dx3 = 0.7f,
            dy3 = 1.8f,
          )
          // l -1.5 1.5
          lineToRelative(dx = -1.5f, dy = 1.5f)
          // l 1.4 1.4
          lineToRelative(dx = 1.4f, dy = 1.4f)
          // l 1.5 -1.5
          lineToRelative(dx = 1.5f, dy = -1.5f)
          // c 0.5 0.3 1.1 0.6 1.8 0.7
          curveToRelative(
            dx1 = 0.5f,
            dy1 = 0.3f,
            dx2 = 1.1f,
            dy2 = 0.6f,
            dx3 = 1.8f,
            dy3 = 0.7f,
          )
          // V 24
          verticalLineTo(y = 24.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -2.1
          verticalLineToRelative(dy = -2.1f)
          // c 0.6 -0.1 1.2 -0.4 1.8 -0.7
          curveToRelative(
            dx1 = 0.6f,
            dy1 = -0.1f,
            dx2 = 1.2f,
            dy2 = -0.4f,
            dx3 = 1.8f,
            dy3 = -0.7f,
          )
          // l 1.5 1.5
          lineToRelative(dx = 1.5f, dy = 1.5f)
          // l 1.4 -1.4
          lineToRelative(dx = 1.4f, dy = -1.4f)
          // l -1.5 -1.5
          lineToRelative(dx = -1.5f, dy = -1.5f)
          // c 0.3 -0.5 0.6 -1.1 0.7 -1.8z
          curveToRelative(
            dx1 = 0.3f,
            dy1 = -0.5f,
            dx2 = 0.6f,
            dy2 = -1.1f,
            dx3 = 0.7f,
            dy3 = -1.8f,
          )
          close()
          // m -7 2
          moveToRelative(dx = -7.0f, dy = 2.0f)
          // c -1.7 0 -3 -1.3 -3 -3
          curveToRelative(
            dx1 = -1.7f,
            dy1 = 0.0f,
            dx2 = -3.0f,
            dy2 = -1.3f,
            dx3 = -3.0f,
            dy3 = -3.0f,
          )
          // s 1.3 -3 3 -3
          reflectiveCurveToRelative(
            dx1 = 1.3f,
            dy1 = -3.0f,
            dx2 = 3.0f,
            dy2 = -3.0f,
          )
          // s 3 1.3 3 3
          reflectiveCurveToRelative(
            dx1 = 3.0f,
            dy1 = 1.3f,
            dx2 = 3.0f,
            dy2 = 3.0f,
          )
          // s -1.3 3 -3 3
          reflectiveCurveToRelative(
            dx1 = -1.3f,
            dy1 = 3.0f,
            dx2 = -3.0f,
            dy2 = 3.0f,
          )
        }
        // M29.95 18.99 27.35 7.8 a2 2 0 0 0 -1.12 -1.37 l-9.4 -4.25 a2 2 0 0 0 -1.65 0 L5.77 6.43 A2 2 0 0 0 4.64 7.8 L2.05 19 a2 2 0 0 0 .4 1.7 l6.88 8.56 A2 2 0 0 0 10.89 30 H21.1 a2 2 0 0 0 1.56 -.75 l6.89 -8.55 a2 2 0 0 0 .39 -1.71 M21.1 28 H10.9 L4 19.44 6.6 8.25 16 4 l9.4 4.25 2.6 11.2z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29.95 18.99
          moveTo(x = 29.95f, y = 18.99f)
          // L 27.35 7.8
          lineTo(x = 27.35f, y = 7.8f)
          // a 2 2 0 0 0 -1.12 -1.37
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.12f,
            dy1 = -1.37f,
          )
          // l -9.4 -4.25
          lineToRelative(dx = -9.4f, dy = -4.25f)
          // a 2 2 0 0 0 -1.65 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.65f,
            dy1 = 0.0f,
          )
          // L 5.77 6.43
          lineTo(x = 5.77f, y = 6.43f)
          // A 2 2 0 0 0 4.64 7.8
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 4.64f,
            y1 = 7.8f,
          )
          // L 2.05 19
          lineTo(x = 2.05f, y = 19.0f)
          // a 2 2 0 0 0 0.4 1.7
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.4f,
            dy1 = 1.7f,
          )
          // l 6.88 8.56
          lineToRelative(dx = 6.88f, dy = 8.56f)
          // A 2 2 0 0 0 10.89 30
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 10.89f,
            y1 = 30.0f,
          )
          // H 21.1
          horizontalLineTo(x = 21.1f)
          // a 2 2 0 0 0 1.56 -0.75
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.56f,
            dy1 = -0.75f,
          )
          // l 6.89 -8.55
          lineToRelative(dx = 6.89f, dy = -8.55f)
          // a 2 2 0 0 0 0.39 -1.71
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.39f,
            dy1 = -1.71f,
          )
          // M 21.1 28
          moveTo(x = 21.1f, y = 28.0f)
          // H 10.9
          horizontalLineTo(x = 10.9f)
          // L 4 19.44
          lineTo(x = 4.0f, y = 19.44f)
          // L 6.6 8.25
          lineTo(x = 6.6f, y = 8.25f)
          // L 16 4
          lineTo(x = 16.0f, y = 4.0f)
          // l 9.4 4.25
          lineToRelative(dx = 9.4f, dy = 4.25f)
          // l 2.6 11.2z
          lineToRelative(dx = 2.6f, dy = 11.2f)
          close()
        }
        // M0 0 h32 v32 H0z
        path {
          // M 0 0
          moveTo(x = 0.0f, y = 0.0f)
          // h 32
          horizontalLineToRelative(dx = 32.0f)
          // v 32
          verticalLineToRelative(dy = 32.0f)
          // H 0z
          horizontalLineTo(x = 0.0f)
          close()
        }
      }.build()
      .also { _kubernetesWorkerNode = it }
  }

@Suppress("ObjectPropertyName")
private var _kubernetesWorkerNode: ImageVector? = null
